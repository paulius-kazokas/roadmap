# Shell Sort

_"..first preliminary sort all values and at the last iteration do insertion sort with them.."_

Variation of Insertion Sort which chooses which element to insert using a __gap__ ( can also be called interval ) of 1 element, each iteration picks up the first unsorted value and compares it's value to it's neighbour and keeps shifting neighbours to the right until finds the correct insertion point. Shell Sort starts out using larger gap value meaning that it's not only comparing with it's neighbour but with elements that are farther away from unsorted value in array. With each iteration gap is reduced. Basically main goal is to reduce the amount of shifting required to achieve sorted number sequence.

:bulb: Note: the algorithm progresses till the last gap value is equals to __1__ which is equivalent to Insertion Sort ( swaping elements places if needed ).

To sum up, Shell Sort does preliminary sorting using gap values that are greater than 1, that preliminary work puts elements in array in closer to their sorted positions ( partially sorted values ) and then at the very last iteration it performs insertion sort, but the insertion sort will be working with values that have had preliminary work on them which results less shifting between elements.

:bulb: Note: the way collect the gap can influence time complexity.

Purpose is to get __gap__ value to be as close as possible to the length of the array we want to sort, without being greater than the length.

Specifications:
* In-place algorithm ( doesn't use any extra memory ).
* Time complexity is dependent on gap ( worst case can be quadratic ).
* Doesn't requires as much shifting as insertion sort, so it performs better.
* Unstable algorithm - in pre insertion algorithm phase for duplicate elements the right element can be shifted in front of first duplicate element.

Participants:
* __gap__ - the closest indicator value to 1, each iteration applied applied formula on which reduced it's value.
* __i__ - index that starts from array.length / 2 till the last element of array.
* __newElement__ - saved value at index according to position __i__.

Implementation:

(_does not uses Knuth Sequence instead will be used __array.length / 2__ formula to calculate gap_)
1. Calculating gap value array.length / 2.
2. __i__ = array.length / 2.
3. __j__ = __i__.
4. __newElement__ = array[i].
5. Comparing __array[j - gap]__ with __newElement__.
6. If __newElement__ is less than __array[j - gap]__ the value of __array[j - gap]__ is saved at __newElement__ position.
7. Setting __j__ to j - gap and set the __newElement__ value at j - gap position.
8. Incrementing __i__ by 1.
9. Setting j to j - gap.
10. Continues steps 4-8 till __j__ equals to __gap__ and then compares array[j] with array[j - gap] ( with gap elements away element ).
11. Ends first iteration with gap value array.length / 2. The gap is devided by 2 again and continues steps from 2-10.
12. Upon gap equals to 1 insertion sort is applied - comparing each value with it's neighbour.

(here image to insert)
