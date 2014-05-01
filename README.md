DataStructureComparison
=======================

A programming assignment given as part of a technical interview.

   Description
This program was made to test the performance difference between an ArrayList and a LinkedList.
The end goal was to establish which of the two was more efficient for item removal.

   Operation

the DataStructureComparison program creates two large lists. One is a LinkedList and one is an ArrayList.
Both lists are populated with the same number of items. These items are simply objects. Both lists are of the
same size and contain the same type of data.
The program tests the remove(int ind) function for both of the lists.
irst it tests the removal of the first item in the list, then it checks removal at 1/4 into the list,
then 1/2, 3/2, and the end. Each removal operation is done a certain number of times 
(a single operation is too quick to get an accurate measurement). Once the time is measured, 
it is averaged based on the number of operations performed.

With each removal from the list, the list size decreases a small amount.
ince there is a different cost(potentially) in determining the size of a LinkedList or an ArrayList,
the list size is recorded before the function begins and decrements after each removal.
hen the operations were completed, the list would be repopulated.
