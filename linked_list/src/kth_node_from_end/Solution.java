package kth_node_from_end;

/**
 * @author Niraj
 */
public class Solution {
    /**
     * Node class
     */
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * @param head the head of the linked list
     * @param k    the value of k
     * @return the pointer to kth node from end
     */
    Node kthFromEnd(Node head, int k) {
        Node temp1 = head, temp2 = head;
        while (--k > 0) { // making the temp2 to move 'k' moves towards right
            temp2 = temp2.next;
        }
        while (temp2 != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}
