# Selection Sort

_"..select highest value per traversal and store it at the end of the array.."_

Traversing array to find the largest element in unsorted partition array lenght - 1 times. Upon reaching last array element we swap highest element with last unsorted element. Decreasing unsorted array element intex by 1 for each traversal and repeating till it reaches 0.

* In-place algorithm ( doen't use any extra memory )
* Quadratic - O(n^2) time complexity ( _Example: 100 steps to sort 10 items, 10 000 steps to sort 100 items and so on.._ )
* Unstable algorithm ( swapping the largest element in unsorted position could cause the swap with it's twin duplicate element to move in front in sorted part )

Implementation:
1. Starts at the left of the array or at the index 0.
2. Last unsorted index is set to array length - 1.
3. Initializing _largest value index_ to 0 ( at the beginning largest value is at index 0 ).
4. Comparing array element at position index 0 with element of position index + 1.
5. If value is higher setting _largest value index_ to elements index.
(to be continued)
