We can see clearly that, in both the strings even if one character is found common, then answer will be "Yes" else "No".
So, we just need to find whether a common character exist b/w the strings.

<b>Using Brute Force</b><br>
We can use brute force with nested loops to calculate the single common character, and hence answer will be "Yes" if at least on common character is found else "No", but it'll take O(n^2) for a single test case.


<b>SOLVING IN O(n) TIME using Counting Sort(for single test case only)</b><br>
As we know, both the strings contains only lower case letters(a-z), we can use two integer arrays of size 123 to store the count of each character in each string.

Initially, set the values in arrays to be 0.

Traverse through both the strings and increment the value at the index equal to ASCII value of the character.

Finally, traverse from 97 to 122 and check if at any traversal, the value of both the count arrays is greater than 0 at current index:
<b>If</b> yes, then print "Yes" <b>else</b> keep on traversing till the end, and if nothing satisfies the condition, print "No".



