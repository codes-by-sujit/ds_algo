Here’s a clean, optimized **Java solution** for the classic interview problem:

---

## ✅ Problem: **Subarray Sum Equals K**

(LeetCode 560 – asked by Google, Amazon, Microsoft, etc.)

---

### 🔧 Java Code (Using Prefix Sum + HashMap):

```java
import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: sum = 0 occurs once
        map.put(0, 1);
        
        for (int num : nums) {
            prefixSum += num;

            // Check if (prefixSum - k) has occurred before
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Update current prefix sum frequency
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println("Total subarrays with sum " + k + " = " + subarraySum(nums, k));
    }
}
```

---

### 🧪 Output:

```
Total subarrays with sum 3 = 2
```

(→ Subarrays: \[1,2] and \[3])

---

### 🧠 How it Works:

* Use a HashMap to store **frequency of each prefix sum** seen.
* For every index:

    * If `prefixSum - k` exists in map → there exists a subarray ending here that sums to `k`.
    * Add its count to the total.

---

### ⏱️ Time and Space Complexity:

* **Time**: O(n)
* **Space**: O(n) (HashMap to store prefix sums)

## Justification
---

### Key idea:

* A **prefix sum** at index `i` is the sum of all elements from the start of the array up to index `i`.

  Let's call the prefix sum at index `i` as `prefixSum[i]`.

* Suppose at some index `j` (where `j < i`), the prefix sum was `prefixSum[j]`.

* Then the **sum of the subarray from index `j+1` to index `i`** is:

  > subarray sum=prefixSum[i]−prefixSum[j]
---

### Now, what if this subarray sum equals `k`?
> prefixSum[i] - prefixSum[j] = k

Rearranging this:
>prefixSum[j] = prefixSum[i] - k


---

### What does this mean for our hashmap lookup?

* When we are at index `i`, we compute `prefixSum[i]`.

* We want to know if there is some earlier prefix sum `prefixSum[j]` such that:

  $$
  prefixSum[j] = prefixSum[i] - k
  $$

* If such a `prefixSum[j]` exists, the subarray from `j + 1` to `i` has sum `k`.

* Therefore, **each occurrence of `prefixSum[j]` in the hashmap corresponds to a subarray ending at `i` with sum `k`**.

---

### Simple example with numbers:

Array: `[1, 2, 3, 4]`, target sum `k = 5`

| Index (i) | Element | prefixSum\[i] | Explanation         |
| --------- | ------- | ------------- | ------------------- |
| -1        | —       | 0             | sum before starting |
| 0         | 1       | 1             | sum(0 to 0) = 1     |
| 1         | 2       | 3             | sum(0 to 1) = 3     |
| 2         | 3       | 6             | sum(0 to 2) = 6     |
| 3         | 4       | 10            | sum(0 to 3) = 10    |

---

At index `i = 2`, prefixSum = 6.

* Check if `prefixSum[i] - k = 6 - 5 = 1` exists in the hashmap.

* Yes, prefixSum = 1 was recorded at index 0.

* So, the subarray from `0 + 1 = 1` to `2` (i.e., `[2, 3]`) sums to 5.

---

### Summary:

* Whenever you find a previously seen prefix sum equal to `prefixSum[i] - k`, it means the elements **after that previous prefix sum index** up to the current index sum up to `k`.

* That’s why we check `map.containsKey(prefixSum - k)` and add the number of times that prefix sum occurred to `count`.

---

If you want, I can walk through this with code or more examples! Would that help?

