package trieWordPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author thethinkingphilosopher@keemail.me
 * Main class
 */
public class WordQueries {
    /**
     * represents a node for the trie tree
     */
    static class TrieNode {
        Map<Character, WordQueries.TrieNode> map; // map to direct the flow of trie
        int noOfWords; // to represent the no of words starting up to this node

        TrieNode() { // default constructor
            this.noOfWords = 0;
            this.map = new HashMap<>();
        }
    }

    /**
     * to insert a string in the trie data structure
     *
     * @param s    the string to insert in the dictionary
     * @param root the current node treated as root itself
     */
    static void insertChar(String s, TrieNode root) {
        if (s.length() == 0) {
            return;
        }
        //if the current node's map don't contains the current character of the string s
        if (root.map.containsKey(s.charAt(0))) {
            TrieNode node = root.map.get(s.charAt(0));
            node.noOfWords++;
            insertChar(s.substring(1), node);
        }
        //if the current node's map contains the current character of the string s
        else {
            TrieNode node = new TrieNode();
            node.noOfWords = 1;
            root.map.put(s.charAt(0), node);
            insertChar(s.substring(1), root.map.get(s.charAt(0)));
        }
    }

    /**
     * to search a prefix in the trie
     *
     * @param s:    the prefix string to search in the trie DS
     * @param root: the current node of the trie, treated as root itself
     * @return the number of strings with the required prefix
     */
    static int findWords(String s, TrieNode root) {
        if (s.length() > 0) {
            if (root.map.containsKey(s.charAt(0)))
                return findWords(s.substring(1), root.map.get(s.charAt(0)));
            else
                return 0;
        } else {
            return root.noOfWords;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, q;
        StringTokenizer tk;
        tk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tk.nextToken());
        q = Integer.parseInt(tk.nextToken());
        String s;
        TrieNode root = new TrieNode();
        while (n-- > 0) {
            s = br.readLine();
            insertChar(s, root);
        }
        while (q-- > 0) {
            s = br.readLine();
            System.out.println(findWords(s, root));
        }
    }
}
