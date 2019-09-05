package mancunian_and_colored_trees;/*
importing required packages
 */
import java.util.*;
import java.io.*;


/*
This class represents the Node of the Tree.
 */
class InvertTree{
    InvertTree parent = null;
    int color = 0;
    int data = 0;
}


/*
This is the Main class containing the main() Method
 */
class TreeColors{

    /*
    This method is used to traverse the node from its position to its ancestor which have the same color.
    In worst case, if no ancestor with same color is found or the root have the same color as that of node,
    then this method run up to root from the node(i.e covering distance equal to height of the tree).
     */
    static int traverse(InvertTree jar){ // receives the node whose ancestor is to find, as argument.
        InvertTree temp = jar; // stores the given node
        while (temp.parent!=null){ // traversing upto root
            temp = temp.parent; 
            if(temp.color==jar.color) // if color of the given node is equal to current node:
                return temp.data; // returns the data of the ancestor node with same color as that of node!
        }

        return -1; // if no ancestor with same color is found
    }

    /*
    This method return the final answer in form of an array!
    takes the array containing the nodes of the tree as argument
     */
    static int[] getAnswer(InvertTree[] arr){
        int[] ans = new int[arr.length]; // variable to store the final answer
        ans[1] = -1; // setting the answer for root node as -1, as it have no ancestor

        for (int i = arr.length -1; i >=1; i--) { // traversing through all the nodes stored in array
            ans[i] = traverse(arr[i]); // calling method to find the final answer for current node
        }

        return ans; // returning the array containing the answer


    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int noOfNodes = Integer.parseInt(tk.nextToken());

        InvertTree[] arr = new InvertTree[noOfNodes+1]; // Array to store the nodes of the given tree

        int noOfColors = Integer.parseInt(tk.nextToken()); // Variable to store the user input containing the number of different colors. This variable is never used!:)

        StringTokenizer tk1 = null;
        if(noOfNodes>1){ // if number of nodes is greater than 1
            tk1 = new StringTokenizer(br.readLine());
        }


        StringTokenizer tk2 = new StringTokenizer(br.readLine()); 

        if(noOfNodes==1){ // if there is only one node!
            System.out.println(-1);
            return;
        }

        InvertTree root = (arr[1] = new InvertTree()); // Initializing the root node!
        root.data = 1; // setting root data!
        int data = 0;
        for(int j=1; j<noOfNodes; j++){
            data = Integer.parseInt(tk1.nextToken());

            if(arr[data]==null){ // if the node hasn't been initialized yet!
                arr[data] = new InvertTree();
                arr[data].data = data;
            }


            if(arr[j+1]==null){ // If the node hasn't been initialized yet!
                arr[j+1] = new InvertTree();
                arr[j+1].data = j+1;
            }


            arr[j+1].parent = arr[data]; // setting the parent-child relationship!:)

        }

        for (int j=1; j<=noOfNodes; j++){ // loop to set the color of each node!
            arr[j].color = Integer.parseInt(tk2.nextToken()); 
        }

        int[] ans = getAnswer(arr); // calling the method to get the answer in form of an array!

        for (int i = 1; i <= noOfNodes ; i++) {
            System.out.print(ans[i]+" "); // printing the final answer!
        }
    }
}
