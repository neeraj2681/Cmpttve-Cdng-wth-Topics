<b>Approach 0:</b> Store the element in a separate array and then get the kth node from end.<br>
You really don't wanna do this!<br><br>
<b>Approach 1:</b> This is a clever trick!<br>
<b>Take two pointers, say temp1 and temp2.<br>
Move the temp2 'k' times towards right.<br>
Now, while temp2 doesn't point to Null keep on moving both temp1 and temp2 by 1 each time.</b><br>
<br>
for eg. {1->2->3->4->-5->6->3}<br>
if k = 3, we need to return -5<br>
Initially, temp1 points to 1 and temp2 also points to 1.<br>
Now, move temp2 to right side by 3. Hence, temp2 will point to 4.<br>
Now, keep on moving both temp1 and temp2, while temp2 itself doesn't point to null.<br>
temp1->1, temp2->4<br>
temp1->2, temp2->-5<br>
temp1->3, temp2->6<br>
temp1->4, temp2->3<br>
temp1->-5, temp2->null<br>
Now, return temp1 at last!