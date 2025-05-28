### 📘 What is **Prefix Sum / Running Sum**?

**Prefix Sum** (also known as **Running Sum**) is a technique where we precompute the cumulative sum of an array to answer range sum queries or analyze subarrays **efficiently**.

---

### 🧠 Definition:

For an array `arr` of size `n`, the **prefix sum array** `prefix` is defined as:

```
prefix[i] = arr[0] + arr[1] + ... + arr[i]
```

So:

```
prefix[0] = arr[0]  
prefix[1] = arr[0] + arr[1]  
prefix[2] = arr[0] + arr[1] + arr[2]  
...
```

---

### ⚡ Why It’s Useful:

Instead of recalculating the sum of a subarray from scratch every time, prefix sums let you compute it in **O(1)** time.

📌 For any subarray `[i, j]`, the sum is:

```
sum(i, j) = prefix[j] - prefix[i - 1]   (i > 0)
sum(0, j) = prefix[j]                   (i == 0)
```

---

### 🔍 When to Use:

Use prefix sums when:

* You need to find the sum of many **subarrays** efficiently.
* The problem involves **"sum between indices"** or **"total in a range"**.
* You see repetitive summing in nested loops (which can be optimized).

---

### 🧠 Common Applications:

* `Subarray Sum Equals K` (LeetCode 560)
* `Range Sum Query` problems
* `Minimum/Maximum Size Subarray Sum`
* 2D prefix sums for matrix range queries
* Difference arrays (range updates)

---

### ✅ Bonus: Prefix Sum with HashMap

Used to track how many times a certain cumulative sum has occurred — especially useful for problems like:

* Count of subarrays with sum K
* Detecting subarrays with 0 sum

---
[Simple Java Explanation](simple_java_explanation.md)

### Related Problems 
- [Subarray with sum K](subarray_sum_equals_k.md) 