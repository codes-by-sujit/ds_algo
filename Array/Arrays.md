## 📘 **Chapter: Arrays**

---

### ✅ **Key Concepts to Master**

1. **Array Basics** [Detail](Array/Arrays.md)

    * Indexing (0-based, random access)
    * Time Complexity:

        * Access: O(1)
        * Search: O(n)
        * Insert/Delete (unsorted): O(1) / O(n)

2. **Prefix Sum / Running Sum**

    * Used for range queries, subarray sums

3. **Two Pointers Technique**

    * Especially useful in sorted arrays, when searching for pairs or moving from both ends

4. **Sliding Window**

    * Efficiently calculate over a window of elements
    * For fixed and variable window sizes

5. **Kadane’s Algorithm**

    * Find max subarray sum in O(n)

6. **Sorting & Partitioning**

    * Built-in sort vs custom sort (Comparator)
    * Dutch National Flag (3-way partitioning)

7. **In-place Operations**

    * Without using extra memory
    * Array rotation, reversal, etc.

---

### 🔍 **Tips to Identify Array-Based Problems**

| Problem Type                        | Keywords / Hints                                               |
| ----------------------------------- | -------------------------------------------------------------- |
| Sum or difference of elements       | “target”, “sum”, “pair” → Two Pointers                         |
| Contiguous subarray/window analysis | “maximum”, “minimum”, “longest” → Sliding Window or Prefix Sum |
| Subarray sum equals condition       | “exactly K”, “divisible” → Prefix Sum + Hash Map               |
| Reordering/Reversing                | “rotate”, “reverse”, “move” → In-place logic                   |
| Max/min element in subarray         | “sliding maximum”, “next greater” → Monotonic Queue/Stack      |
| Count elements / frequency          | “duplicates”, “frequency” → Hashing                            |

---

### 🧠 **Must-Practice Patterns**

1. **Two Pointers**

    * When array is sorted or indexes converge
    * e.g., `Two Sum II`, `Remove Duplicates from Sorted Array`

2. **Sliding Window**

    * Optimal subarray problems
    * e.g., `Longest Substring Without Repeating Characters`, `Max Consecutive Ones`

3. **Prefix Sum + Hashing**

    * Subarrays with a specific sum
    * e.g., `Subarray Sum Equals K`

4. **Sorting**

    * When order/position matters
    * e.g., `Merge Intervals`, `Sort Colors`

---

### 💯 **Practice Problems**

#### 🟢 Easy

* Two Sum
* Move Zeroes
* Remove Duplicates from Sorted Array
* Maximum Subarray
* Merge Sorted Array

#### 🟡 Medium

* Container With Most Water
* Best Time to Buy and Sell Stock
* Product of Array Except Self
* 3Sum
* Subarray Sum Equals K
* Longest Substring Without Repeating Characters

#### 🔴 Hard

* Trapping Rain Water
* Maximum Product Subarray
* Sliding Window Maximum
* Median of Two Sorted Arrays
* Count of Smaller Numbers After Self

---

### 📌 **Interview-Ready Tips**

* Practice **in-place operations** — interviewers often ask for O(1) space.
* Always check for **edge cases**: empty array, single element, negative values, duplicates.
* Be clear with **time vs space trade-offs**.
* Practice **explaining brute force** then improving to optimal — shows problem-solving growth.

---

Would you like this converted into a **daily revision tracker** or **quiz format** to reinforce learning?
