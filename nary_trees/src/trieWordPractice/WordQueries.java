package trieWordPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordQueries {

    static class TrieNode {
        Map<Character, WordQueries.TrieNode> map;
        int noOfWords;

        TrieNode() {
            this.noOfWords = 0;
            this.map = new HashMap<>();
        }
    }

    static void insertChar(String s, TrieNode root) {
        if (s.length() == 0) {
            return;
        }

        if (root.map.containsKey(s.charAt(0))) {
            TrieNode node = root.map.get(s.charAt(0));
            node.noOfWords++;
            insertChar(s.substring(1), node);
        } else {
            TrieNode node = new TrieNode();
            node.noOfWords = 1;
            root.map.put(s.charAt(0), node);
            insertChar(s.substring(1), root.map.get(s.charAt(0)));
        }
    }

    static int findWords(String s, TrieNode root){
        if(s.length() > 0) {
            if(root.map.containsKey(s.charAt(0)))
            return findWords(s.substring(1), root.map.get(s.charAt(0)));
            else
                return 0;
        }else {
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
        while(n-- > 0) {
            s = br.readLine();
            insertChar(s, root);
        }
        while(q-- > 0) {
            s = br.readLine();
            System.out.println(findWords(s, root));
        }
    }

}
