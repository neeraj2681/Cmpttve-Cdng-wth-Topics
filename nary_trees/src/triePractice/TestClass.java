package triePractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class TestClass {

    static class CharNode {
        Map<Character, CharNode> map;
        boolean endOfWord;
        int weight;

        CharNode() {
            this.endOfWord = false;
            this.weight = 0;
            this.map = new HashMap<>();
        }
    }

    static void insertChar(String s, int weight, CharNode root) {
        if (s.length() == 0) {
            root.endOfWord = true;
            root.weight = weight;
            return;
        }

        if (root.map.containsKey(s.charAt(0))) {
            insertChar(s.substring(1, s.length()), weight, root.map.get(s.charAt(0)));
        } else {
            root.map.put(s.charAt(0), new CharNode());
            insertChar(s.substring(1, s.length()), weight, root.map.get(s.charAt(0)));
        }
    }

    static int maxWeight(String prefix, CharNode root, int weight) {
        if (prefix.length() >= 1) {
            return maxWeight(prefix.substring(1, prefix.length()), root.map.get(prefix.charAt(0)), weight);
        }

        if (root.endOfWord) {
            if (weight < root.weight)
                weight = root.weight;
        }
        for (int i = 97; i <= 122; i++) {
            if (root.map.containsKey((char) i)) {
                return maxWeight(prefix, root.map.get((char) i), weight);
            }
        }
        return weight;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, q;
        StringTokenizer tk;
        tk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tk.nextToken());
        q = Integer.parseInt(tk.nextToken());
        String s;
        CharNode root = new CharNode();
        int weight = 0;
        while (n-- > 0) {
            tk = new StringTokenizer(br.readLine());
            s = tk.nextToken();
            weight = Integer.parseInt(tk.nextToken());
            insertChar(s, weight, root);
        }

        while (q-- > 0) {
            s = br.readLine();
            weight = maxWeight(s, root, 0);
            if(weight == 0)
                System.out.println(-1);
            else
                System.out.println(weight);
        }
    }
}
