You are given an array A of N integers. Determine the minimum value of the following expression for all valid i, j:<br>
<code>(Ai AND Aj) XOR (Ai OR Aj)</code>, where <code>i!= j</code>.<br><br>

***Input format***<br>
First line: A single integer T denoting the number of test cases<br>
For each test case:<br>
First line contains a single integer N, denoting the size of the array<br>
Second line contains N space-separated integers <code>A1, A2, A2,....., An</code>.<br><br>

***Output format***<br>
For each test case, print a single line containing one integer that represents the minimum value of the given expression<br><br>

***Constraints***<br>
1 <= T <= 1000<br>
1 <= N <= 100000<br>
1 <= Ai <= 1000000000<br><br>

Note: Sum of N over all test cases does not exceed 1000000<br>

***Sample Input***<br>
2<br>
5<br>
1 2 3 4 5<br>
3<br>
2 4 7<br><br>

***Sample Output***<br>
1<br>
3<br><br>

***Explanation***<br>
For test case #1, we can select elements 2 and 3, the value of the expression is (2 AND 3) XOR (2 OR 3) = 1, which is the minimum possible value. Another possible pair is 4 and 5.<br>
For test case #2, we can select elements 4 and 7, the value of the expression is (4 AND 7) XOR (4 OR 7) = 3, which is the minimum possible value.<br><br>

*Problem link*: <a href = "https://www.hackerearth.com/challenges/competitive/march-circuits-20/algorithm/minimum-and-xor-or-6a05bbd4/">minimum-and-xor-or</a> 
