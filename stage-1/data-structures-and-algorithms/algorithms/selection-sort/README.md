# Selection Sort

_"..select highest value per traversal and store it at the end of the array.."_

Traversing array to find the largest element in unsorted partition array lenght - 1 times. Upon reaching last array element we swap highest element with last unsorted element. Decreasing unsorted array element intex by 1 for each traversal and repeating till it reaches 0.

* In-place algorithm ( doen't use any extra memory )
* Quadratic - O(n^2) time complexity ( _Example: 100 steps to sort 10 items, 10 000 steps to sort 100 items and so on.._ )
* Unstable algorithm ( swapping the largest element in unsorted position could cause the swap with it's twin duplicate element to move in front in sorted part )

Participants:
* Last unsorted index - last index of the unsorted partition
* i - index used to traverse the array from left to right (i++)
* largest value index - descrbes index of higher value index between i and i + 1

Implementation:
1. Starts from arrays element index 0.
2. _Last unsorted index_ is set to __array length - 1__.
3. Initializing _largest value index_ to 0 ( at the beginning largest value is at index 0 ).
4. Comparing array element at position index __0__ with element of position __index + 1__. If element index + 1 value is higher setting _largest value index_ to elements index, else do nothing.
5. Incrementing i by 1.
6. Continues steps 2-5 till _i_ equals _Last unsorted index_, then _Last unsorted index_ decreasing by 1.
7. Continues steps 2-6 till _i_ equals 0.

<p float="left">
  <img src="http://www.equestionanswers.com/c/images/selection-sort-selection1-iteration-stages.png" width="200" height="350">
  <img src="http://www.equestionanswers.com/c/images/selection-sort-selection2-iteration-stages.png" width="200" height="300">
  <img src="http://www.equestionanswers.com/c/images/selection-sort-selection3-iteration-stages.png" width="200" height="220">
  <img src="http://www.equestionanswers.com/c/images/selection-sort-selection4-iteration-stages.png" width="200" height="150">
 </p>
