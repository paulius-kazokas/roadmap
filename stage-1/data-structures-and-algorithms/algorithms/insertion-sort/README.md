# Insertion Sort

_"..inserting unsorted values in sorted partition and comparing with each sorted value.."_

Sorted array values starts at array index 0 - at first iteration it's highest sorted value. Value comparison starts from right to left which means comparing first unsorted array value with last sorted array values in the beginning of the array. If unsorted value is higher than sorted value the unsorted value is saved at __new highest__ value, the last sorted value is placed at unsorted value index ( place ), sorted array length increments and the higher value is placed at the end of the sorted array. If there's more than one element in sorted array part then the unsorted value is compared with each sorted value from right to left ( last to first sorted value index ).

Specifications:
* In-place algorithm ( doesn't use any extra memory )
* Quadratic - O(n^2) time complexity ( _Example: 100 steps to sort 10 items, 10 000 steps to sort 100 items and so on.._ )
* Stable algorithm - picking elements from left to right and if the element is less or equal or duplicate the comparison stops and the element will be place at the right of the sorted elements ( if duplicate then first duplicate will stays in it's original position )

Participants:
* __firstUnsortedIndex__ - the first index of the unsorted partition
* __i__ - index used to iterate through sorted array partition
* __newElement__ - the _insertable_ unsorted array element - __array[firstUnsortedIndex]__

Implementation:
1. Element in array index 0 position is a first sorted array element ( can be any value even tho other values are has higher values ). Sorted partition length 1.
( elements from 1 to array.length - 1 are unsorted )
2. Setting __firstUnsortedIndex__ to 1.
3. Setting __newElement__ to __firstUnsortedIndex__ value.
4. On each iteration comparing __firstUnsortedIndex__ value with sorted partition last element ( right to left sorted value comparison ).
5. If __firstUnsortedIndex__ value is greater or equal than any sorted partition element it replaces sorted value with __firstUnsortedIndex__ value.
6. The __firstUnsortedIndex__ value in unsorted partition becomes last sorted partition element.
7. Previous sorted partition elements moves to the right by 1.
( (5-7 steps) compares each sorted value with first unsorted value (from right to left) and inserts in sorted partition index where unsorted value is greater or equals )
6. __firstUnsortedIndex__ increments by 1.
7. Continues steps 3-6 till unsorted partition length - 1.

:bulb: Note: on each unsorted value comparison with sorted value if the first sorted value is __less or equals__ with unosrted value and if there's more sorted values to the left it wont compare since the values are sorted!

<p align="midlde">
  <img src="https://upload.wikimedia.org/wikipedia/commons/b/b1/Insertion-sort.svg" width="500" height="500">
</p>
