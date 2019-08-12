As we can see this is a really simple question, we just need to check the occurrence of "SUVOJIT" first and then "SUVO".
<pre><b>Iterate through the string using a loop.
If "S" is the character at current index i.

Then check for the value of i+6, if it is less than String length
and "SUVOJIT" is the resulting substring from index i to i+6, then increment
the variable counting the occurrence of "SUVOJIT".
Also increment the value of current index i by 6 and use continue statement
without going any furthur in the loop.

else

Check for the value of i+3, if it is less than String length
and "SUVO" is the resulting substring from index i to i+3, then increment
the variable counting the occurrence of "SUVO" and increment the value of
current index i by 3.
You don't need to use continue statement here.


The time complexity in worst case will be O(n), if "SUVO" and "SUVOJIT"
both does not occur in the string.</b></pre>


