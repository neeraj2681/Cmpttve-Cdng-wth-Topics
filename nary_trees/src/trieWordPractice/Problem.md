Jayati shared an interesting game for testing memorization power with her friends. The game is:<br>

You will get a list of words and some queries. You will be asked, to find out how many words in the list have a query word as a prefix.<br>

If you will not be able to answer her queries, you will miss a chance to impress her. And at any cost, you want to impress her by answering quickly for each query.<br>

***Input Format:***<br>
The first line contains N, Q: the number words in list and number of queries.<br>
<br>
N lines follow, with words (of the list) consisting of lowercase letters. The sum of their lengths won't be greater than 106.

Q lines follow, with words (queries) consisting of lowercase letters. The sum of their lengths won't be greater than 106.<br>

***Output Format:***<br>
For each query print the number of words in the list which have actual word as the prefix.


***Sample Input***<br><code>
12 6<br>
bulldog<br>
dog<br>
dogged<br>
doggedly<br>
doggerel<br>
dogma<br>
dogmatic<br>
dogmatism<br>
dogs<br>
catastroph<br>
catastroph<br>
doctor<br>
cat<br>
dog<br>
dogg<br>
do<br>
doctrinography<br>
dogge</code>

***Sample Output***<br><code>
2<br>
8<br>
3<br>
9<br>
0<br>
3<br></code>


*Problem link:* <a href= "https://www.hackerearth.com/practice/data-structures/advanced-data-structures/trie-keyword-tree/practice-problems/algorithm/dummy4-2/">Word Queries</a>