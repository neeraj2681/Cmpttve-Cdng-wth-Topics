You have organized a party and invited <code>N - 1</code> other friends to the party. Therefore, there are total <code>N</code>

friends. Everyone must shake hands with every other person except the people he or she dislikes. There are only 10 people at the party who dislike the other 9 people. The remaining people like everyone who is present at the party. Each friend has its own unique identity number.

Two friends shake hands only if both like each other. In other words, if any of them dislike others, then they cannot shake hands. You must calculate the number of handshakes done at the party.<br>
***Input format***<br>
The first line contains a single integer N (1<=N<=10^9).<br>
The next 10 lines contain 10 integers each.<br>
The first integer in a line represents the unique identity of a friend and the other 9 integers represent the identity number of people it dislikes.<br>

***Output format***<br>
Print a single integer denoting the total number of handshakes.
<br>

***Sample Input***<br>
<code>11<br>
7 3 11 4 5 6 1 2 8 9<br>
1 11 10 5 6 8 3 7 4 2<br>
9 3 2 7 5 8 10 4 1 11<br>
8 2 5 10 3 6 4 7 9 1<b>
3 10 2 11 7 9 1 5 6 4<br>
5 11 1 3 8 10 4 6 2 9<br>
11 1 8 7 3 2 10 6 5 9<br>
4 1 5 11 10 6 3 2 9 7<br>
2 1 9 11 8 6 7 10 3 4<br>
10 5 4 1 3 6 2 11 7 8<br></code>
<br>
***Sample Output***<br>
1<br>

***Explanation***<br>
Only for explanation purposes, test cases will have only 10*10 dislike matrix.<br>

***Input***<br>
<code>10<br>
1 2 4 5 6<br>
2 1 3 8 10<br>
3 1 2 4 10<br></code>

***Output***<br>
35<br>

In the given test case -<br>

1 dislikes 2,4,5,6<br>

2 dislikes 1,3,8,10<br>

3 dislikes 1,2,3,10<br>

so, 1 can handshake with 7,8,9,10 (Not with 3 as 3 dislikes 1 even if 1 likes 3)<br>

Total number of handshakes- 36<br>

