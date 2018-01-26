Xsquare loves to play with strings a lot.
Today, he has two strings S1 and S2 both consisting of lower case alphabets.
Xsquare listed all subsequences of string S1 on a paper and all subsequences of string S2 on a separate paper. Xsquare wants to know whether there exists a string which is listed on both the papers.

Xsquare thinks that this task is pretty boring and handed it to you. Please accomplish this task on his behalf.


<pre><b>Input</b><break>
First line of input contains a single integer T denoting the number of test cases.
Each test case consists of two lines.
First line of each test case contains a string denoting string S1.
Next line of each test case contains a string denoting string S2.</pre>


<pre><b>Output</b>
For each test case, Print Yes if both papers contain a common string otherwise Print No.</pre>


<pre><b>Constraints</b>
1 ≤ T ≤ 10^5

1 ≤ |S1| ≤ 10^5

1 ≤ |S2| ≤ 10^5

Sum of |S1| over all test case does not exceed 5*105

Sum of |S2| over all test case does not exceed 5*105</pre>


<pre><b>SAMPLE INPUT</b>
2
prtuci
japooc
hello
buy</pre>

<pre><b>SAMPLE OUTPUT</b>
Yes
No</pre>

<pre><b>Explanation</b>
<b>Testcase 1 :</b>
There is a common subsequence of letters between S1 and S2.
For ex: "pc" is subsequence of S1 and S2 both.

<b>Testcase 2 :</b>
There is no common subsequence of letters between S1 and S2.</pre>


<pre><b>Time Limit: 1.0 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB</b></pre>
