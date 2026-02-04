# DSA-Java :)
## Data Structure &amp; Algorithms - using Java

1. Linear Search (Time Complexity is `O(n)`)
2. Binary Search (Time Complexity is `O(log n)`)
3. Bubble Sort (Time Complexity is `O(n²)`)

## Big O Notation Quick Reference

A comprehensive guide to understanding **Time Complexity** and algorithm efficiency.

## 🚀 Complexity Hierarchy
From most efficient to least efficient:

| Notation | Name | Growth Rate |
| :--- | :--- | :--- |
| **$O(1)$** | Constant | Excellent |
| **$O(\log\ n)$** | Logarithmic | Good |
| **$O(n)$** | Linear | Fair |
| **$O(n\ \log\ n)$** | Linearithmic | Decent |
| **$O(n^2)$** | Quadratic | Poor |
| **$O(2^n)$** | Exponential | Very Bad |
| **$O(n!)$** | Factorial | Worst Case |

---

## 🔍 Definitions

### 1. O(1) - Constant Time
The execution time remains the same, regardless of the size of the input data set.
* **Example:** Accessing a specific index in an array.

### 2. O(log n) - Logarithmic Time
The time grows linearly while the input size grows exponentially. 
* **Example:** Binary Search.

### 3. O(n) - Linear Time
The time grows in direct proportion to the size of the input.
* **Example:** A single loop through an array.

### 4. O(n log n) - Linearithmic Time
Common in efficient sorting algorithms. It means a linear operation is performed $\log n$ times.
* **Example:** Merge Sort, Quick Sort.

### 5. O(n²) - Quadratic Time
Performance is directly proportional to the square of the size of the input.
* **Example:** Nested loops (e.g., Bubble Sort).

### 6. O(2ⁿ) - Exponential Time
Growth doubles with each addition to the input data set.
* **Example:** Recursive calculation of Fibonacci numbers.

### 7. O(n!) - Factorial Time
Growth is astronomical even for small increases in input.
* **Example:** Generating all permutations of a string.

---

## 💡 Why It Matters
Big O notation helps developers predict how an algorithm will perform as the data scales. It allows us to compare different approaches to the same problem and choose the most efficient one for the job.
