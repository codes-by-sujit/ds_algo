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
