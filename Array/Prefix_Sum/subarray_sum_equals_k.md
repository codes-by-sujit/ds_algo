## [LeetCode 560](https://leetcode.com/problems/subarray-sum-equals-k/description/)
### 📘 **Problem Statement: Subarray Sum Equals K**

(LeetCode 560 – Common in interviews at Google, Amazon, Microsoft)

---

#### 🔧 **Given:**

* An array of integers: `int[] nums`
* An integer: `k`

---

#### 🧩 **Task:**

Return the **total number of continuous subarrays** whose **sum equals exactly `k`**.

---

#### ✅ **Constraints:**

* The subarray must be **contiguous** (i.e., no skipping elements).
* The array may contain **positive, negative, and zero** values.
* Return just the **count** of such subarrays.

---

### 🧪 **Example 1:**

```java
Input: nums = [1, 1, 1], k = 2  
Output: 2

Explanation:
Subarrays that sum to 2 are: [1,1] (from index 0 to 1) and [1,1] (from index 1 to 2)
```

---

### 🧪 **Example 2:**

```java
Input: nums = [1, 2, 3], k = 3  
Output: 2

Explanation:
Subarrays that sum to 3 are: [1,2] and [3]
```

---

### ❌ What NOT to Do:

Don’t just check every possible subarray with nested loops — this results in **O(n²)** time and is inefficient for large arrays.

### [Java Solution](subarray_sum_equals_k_java.md)
