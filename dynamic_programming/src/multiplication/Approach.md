<b>Approach 1:</b> The first approach any programmer would try will be a brute force approach, where for each element in the array
the product of remaining elements will be calculated and stored in a new array.<br> Later that array will be returned.
But this approach will take O(n^2) time.
<br><br>
<b>Approach 2:</b> If we can calculate the product of all the elements in the array and then for each position we can
divide that product by the element at that particular position, we can get the answer for each array position.<br>
This will take O(n) time, but we have used division operator here.
<br><br>
<b>Approach 3:</b> For each product, if we can somehow get the product of its left side elements and product of its right side
elements, we can definitely get the product for that particular element by multiplying left and right side products.<br>
For eg. we have an array {1, 2, 3, 4}<br>
I'll create a new dummy array for storing prefix multiplication i.e {1, 2, 6, 24}<br>
Similarly, I can create a suffix multiplication i.e {24, 24, 12, 4}
<br><br>
Now for each element I can calculate the product of remaining elements by multiplying the left side and right side products.<br>
i.e for the above eg. for first element {lhs product * rhs product = no lhs product * 24 = 24}<br>
for second element {lhs product * rhs product = 1 * 12 = 12}<br>
for first element {lhs product * rhs product = 2 * 4 = 8}<br>
for first element {lhs product * rhs product = 12 * no rhs product = 12}<br>
<br>
This way the problem can be solved without using division operator, in O(n) time.