The problem is much simpler than it looks.<br>
This problem was classified as greedy, but rather I found it as a simple dp problem. I might be wrong here.<br>
<br>
<b>Approach 0: Brute force</b><br>
make a temporary variable say <b>int count = 0;</b>
traverse the array<br>
if zero comes, increment count by 1 and invert the values of all array elements to the right.<br>
if one comes, do nothing.<br>
At the end of loop you'll get the answer stored in <b>count</b> variable.
<br><br>
<b>This method is surely not recommended, as the time complexity is O(n^2) here.</b><br><br>

<b>Approach 1: Using a count variable and taking the no of zeroes to the left into consideration</b></br>
make a temporary variable and initialise it to 0.<br>
now traverse the array.<br>
<b>Now the important part starts from here</b><br>
check for the value of count, if the value of count is even that means, on the left side of current 
element, even no of zeroes have occurred(it also counts the 1's which became 0 due to their left side element's alterations).
It simply means if the current element is 1, it would have remained 1 
and if it is 0 it would have remained 0.<br>

Similarly, for odd value of count, the number at current position would have altered i.e if it is 1 it would have altered to 0 and, if it was 0 it would have altered to 1<br>

Now, we want the value of count to be even for current element = 1 and odd for current element = 0.<br>

Simply check for current element and correspondingly check for value of count and then decide what to do.<br>
<pre>
for eg. 100110
int count = 0;
for 1 -> count is zero, do nothing<br>
for 0 -> count is zero, this element 0 will not be affected by previous value of count. We need to make it one, so increment count by 1 i.e count++; and move on.<br>
for 0 -> count is one, this element 0 will definitely be altered by previous value of count. So do nothing and move on.<br>
for 1 -> count is one, this element 1 will definitely be altered by previous value of count. So it is zero due to previous value of count, and hence to make it 1, we increment count by 1. i.e count++<br>
for 1 -> count is two, this element 1 will not be altered by previous value of count. So do nothing and move on.
for 0 -> count is two, this element 0 will not be altered by previous value of count. So to make it 1 ,we'll increment count by 1, i.e count++</pre>
<b>This solution will take O(n) time and O(1) space.</b>
 



 