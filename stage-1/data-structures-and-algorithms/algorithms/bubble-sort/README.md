# Bubble Sort

_"..larger values bubbling up at the end of the array.."_

Sorts arrays using unsorted partition index __(array length - 1)__ and index (__i__) that will always starts at __0__ to traverse the array from left to right.

* In-place algorithm ( _logically partitioning the array, not creating another array to perform this sort_ )
* Quadratic - O(n^2) time complexity ( _Example: 100 steps to sort 10 items, 10 000 steps to sort 100 items and so on.._ )
* Algorithm degrades quickly

Implementation:
1. Starts at the left of the array or at the index 0.
2. Compares array index element with array index+1 element.
3. If left array index element is greater than right array index element then we swap them places, else we do nothing.
4. Incrementing index i value.
5. Continues step 2, 3 and 4 __array length - 1__ times.
6. Places highest array index element at the array length - 1 position after first traversal.
7. Decreasing unsorted partition index value by 1 (because after first traversal we consider array length - 1 position is sorted).
8. Setting index i value to 0.
Note. After each traversal from current unsorted partition index becomes sorted partition and then sorting continues in range 0 and unsorted partition index - 1.
8. Continues 2-8 steps till all values sorted (swapped and compared by neighbours value) - i value is 0 which means all values sorted.

![Bubble sort scheme](https://miro.medium.com/max/1104/1*RTUyyi7jMruuzAE9I7ggjQ.png)
