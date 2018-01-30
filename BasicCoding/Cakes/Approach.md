This task is very simple, we can use a while loop untill the number of cakes left is greater than 0.<br>
We will make a variable to store the Round Number i.e. <b>count</b> and initialize it by 1.<br>
<b><pre>And in each iteration:
We will decrement the number of cakes by the round no. i.e count 
and check whether the no. of cakes remaining is greater than 0. 
If no, then return Darshak, else do nothing.

Then, we will decrement the no. of cakes by the square of round no. i.e (count * count)
and check whether the no. of cakes remaining is greater than 0.
If no, then return Chandan, else do nothing.</pre></b>

<b>The complexity of the code will be much lesser than O(n), because each time we are subtracting the round no. and square of round no. from the no. of cakes.</b>
