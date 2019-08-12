As we can see the problem is based on stacks.


<b>NOTE: If a closing bracket comes and no matching opening bracket is found before this bracket, then the string is unbalanced and we do not need to check for next characters.</b>

We can use two stacks:<br>
First one to store the brackets called BRACKETS and second one to store the position of brackets which are currently unbalanced called POSITION.

<b>We will iterate through the given string,<br>

If characters other than brackets are found, we will ignore them and continue to iterate the loop.

If an opening bracket is found, we will push the bracket to BRACKETS and push it's position to POSITION.

If the BRACKETS isn't empty and a closing bracket is found:<br>
We will check the element at the top of BRACKETS, if it's the opening bracket for the current closing bracket, then we will pop the topmost element from BRACKETS and POSITION or else we will push the position of current closing bracket to the top of POSITION and break out of the loop.


If the BRACKETS is empty and a closing bracket is found:<br>
We will push the position of current closing bracket to the top of POSITION and break out of the loop.



<i>At last when the traversing will be fininshed.</i><br>
We will check whether the POSITION is empty or not.<br>
If POSITION is empty, return 0 i.e. print Success<br>
else return the topmost element of POSITION i.e print the position of the unbalanced bracket.

IN WORST CASE WE MAY TRAVERSE THE WHILE STRING, SO TIME COMPLEXITY WILL BE O(n).</b>
