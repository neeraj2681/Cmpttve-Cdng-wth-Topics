<b>If we read the question carefully, we can see that it's not necessary that the tree will be a binary tree!</b>

<b>So, we need to consider the tree as Nary i.e having atmost N-childs!</b>

For each node, to calculate the ancestor with the same color as that of the node, we need to go up from the node(and <b>in worst case there may be no ancestor with the same color OR the root may have the same color as that of the node. So, in worst case we may need to go upto root node i.e height of the tree. And in case of skew trees, height is O(n)</b>).

<pre><b>We can define each node with three elements:
1. A reference to its parent.
2. An integer type variable containing the data of the node.
3. An integer type variable to store the color of the node.</b></pre>

This tree will be like an inverted tree i.e from a node we can only move to its parent.

So, for each node we will keep on traversing upto the ancestor with the same color, or upto root if no ancestor with same color is found!

The complexity of the code in worst case will be O(n^2).
