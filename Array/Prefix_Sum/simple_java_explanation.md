Sure! Here's a **simple Java program** to compute the **prefix sum (running sum)** of an array:

---

### ✅ Java Example: Prefix Sum

```java
public class PrefixSumExample {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 6, 2};
        int[] prefixSum = new int[arr.length];

        // Compute prefix sum
        prefixSum[0] = arr[0];  // First element is the same
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Print original array
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Print prefix sum array
        System.out.print("\nPrefix sum:     ");
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
    }
}
```

---

### 🔍 Output:

```
Original array: 2 3 -1 6 2 
Prefix sum:     2 5 4 10 12
```

---

### 🧠 What It’s Doing:

* `prefixSum[0] = arr[0]` → initialize
* Then for each `i > 0`:
  `prefixSum[i] = prefixSum[i - 1] + arr[i]`

So it builds up a **cumulative total** from left to right.

---

Let me know if you want this extended to solve a real problem like **Subarray Sum Equals K** in Java.
