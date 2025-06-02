# 🔍 1. Understanding the Two Pointers Technique
 ## When to Use:
- Arrays or Strings are sorted or need to be traversed from both ends
- Need to compare elements or find pairs/triplets
- Goal is to reduce time complexity from O(n²) to O(n)

## Strategy 
### - Converging Pointer
Pointer started at opposite and move inward.<br/>
Example:- palindrome check. 
1 pointer at start and 1 at end.

### - Parallel Pointer / Fast-low pointer
Both pointers start from one end and move in same direction.<br/>
Example:- Finding sub array

### - Trigger based pointer
Both pointer starts from same location, but the first pointer moves only when then second pointer meet any condition (trigger point)<br/>
When we need to calculate in staging. 
---
| Category                    | Problem Pattern                         | Examples                                         |
| --------------------------- | --------------------------------------- | ------------------------------------------------ |
| **Sorted Array - Pair Sum** | Move pointers inward                    | `Two Sum II`, `Pair with Target Sum`             |
| **Remove Duplicates**       | Slow + fast pointer                     | `Remove Duplicates from Sorted Array`            |
| **Reverse/String Ops**      | In-place swap with two ends             | `Reverse String`, `Valid Palindrome`             |
| **Container Problems**      | Max area via width × min height         | `Container With Most Water`                      |
| **Cycle Detection**         | Fast and slow pointer (tortoise & hare) | `Linked List Cycle`                              |
| **Window Shrinking**        | Minimize or count windows               | `Minimum Window Substring` (with sliding window) |
---

### ⚙️ **4. Tips to Identify Two Pointer Scenarios**

* Array/String is **sorted** → Try start/end pointer
* Looking for **pairs/triplets/quadruplets**
* Need **in-place** operations (space-optimized)
* Looking for **minimum/maximum** in a **window**
* Substring/subarray problems with **length constraints**

---

### 📌 5. Implementation Tips

* Always check **edge cases** (empty arrays, one element)
* Watch for **off-by-one** errors
* Use **while (left < right)** for opposite ends
* Use **while (right < n)** for sliding window

