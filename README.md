#### Custom implementation of Mergesort

Done as part of an undergraduate curriculum in Computer Science though Colorado State University, Global Campus.

##### Concepts utilized
* Recursion and understanding of stacks
* Branching
* OOP
* Encapsulation

#### Mergesort explained
Mergesort is a stable sorting algorithm that uses the divide-and-conquer algorithm technique. It is said to be stable because--in the case of two identical elements--it will maintain the order in which they were provided in the input. 

The mergesort algorithm has a time complexity of `O(n log n)` with a space complexity of `O(log n)`. Its time complexity is evaluated as `O(n log n)` because of its subdivision of unsorted arrays that are then merged to form a sorted array. The `O(log n)` refers to the depth of the tree of subarrays. At each of these levels, we perform a merge in linear time which is `O(n)`. The resulting complexity is `O(n log n)` because we consider the height of the tree multiplied by its depth.