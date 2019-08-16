<b>Approach 0: A naive approach</b><br>
for each element in array, scan the whole array and check if sum equals the given sum<br>
something like for each i - traverse the whole array and check if(i + current element) == given sum<br>
This is a bad approach as time complexity is O(n^2).
<br><br>
<b>Approach 1: Sort the array and perform binary search</b><br>
Sort the array and, for each array element check whether an element equals to (sum - current element) 
is present in the array using binary search.<br>
This approach will take O(nlogn) - for sorting and O(nlogn) - for searching the required element<br>
so, a total of O(nlogn) is the time complexity. <br><br>

<b>Approach 3: Use Hashing</b><br>
Use a hashing based data structure like Maps.<br>
Scan the array and put each element in the map along with its position.<br>
If an element occurs more than one time, its latest position will be stored in the map.<br>
Now again traverse the array and for each element check whether (sum - current element) is present in the map.<br>
<b>Also, be careful with the cases like<br>
sum = 4 and suppose you have only 3 elements in the array {1, 2, 5}<br>
for 1st element, You have to search for 4 - 1 = 3. it isn't present in the map.<br>
for 2nd element, you have to search for 4 - 2 = 2, it is present in the map with position  = 1.<br>
So,to avoid this condition, you have to do an extra check whether the element  = (sum - current element) is present and
if present then it's position must not be same as current element's position.</b><br><br>
This way you can answer the question in O(n) time.