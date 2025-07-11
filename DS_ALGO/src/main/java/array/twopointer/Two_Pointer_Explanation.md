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

## Patterns in detail
| **Pattern**                            | **Description**                                                                  | **LeetCode Problems** (in increasing difficulty)                                                                                                                                                                                                                                                                                                                                    |
| -------------------------------------- | -------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **1. Opposite Ends**                   | Start two pointers at the beginning and end of array and move toward each other. | - [167. Two Sum II - Input Array is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) <br> - [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) <br> - [680. Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/) <br> - [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/) |
| **2. Same Direction**                  | Two pointers move in the same direction, usually to find window or subarrays.    | - [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) <br> - [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/) <br> - [75. Sort Colors](https://leetcode.com/problems/sort-colors/) <br> - [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)                        |
| **3. Sliding Window**                  | Fixed or variable size window to maintain a condition.                           | - [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) <br> - [438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) <br> - [567. Permutation in String](https://leetcode.com/problems/permutation-in-string/)                                            |
| **4. Meet in Middle**                  | Two pointers meet in the middle to compare or combine results.                   | - [344. Reverse String](https://leetcode.com/problems/reverse-string/) <br> - [345. Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/) <br> - [866. Prime Palindrome](https://leetcode.com/problems/prime-palindrome/)                                                                                                                          |
| **5. Two Pointer with Sorting**        | Sort first, then apply two pointers to check pairs/triplets.                     | - [15. 3Sum](https://leetcode.com/problems/3sum/) <br> - [16. 3Sum Closest](https://leetcode.com/problems/3sum-closest/) <br> - [18. 4Sum](https://leetcode.com/problems/4sum/)                                                                                                                                                                                                     |
| **6. Two Pointer in Linked List**      | Fast and slow pointers to find cycles or middle nodes.                           | - [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) <br> - [142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) <br> - [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) <br> - [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)                  |
| **7. Merging Technique**               | Merge two sorted arrays/lists using two pointers.                                | - [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) <br> - [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) <br> - [986. Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/)                                                                                                      |
| **8. Binary Search with Two Pointers** | Use two pointers in a binary search context to narrow down search.               | - [240. Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/) <br> - [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) <br> - [1099. Two Sum Less Than K](https://leetcode.com/problems/two-sum-less-than-k/)                                                                                                       |

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

