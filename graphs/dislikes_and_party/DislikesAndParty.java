import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class DislikesAndParty{

    public static int findPos(List<Integer> arrlst, int key) {
        for(int i = 0; i < arrlst.size(); i++) {
            if(arrlst.get(i) == key)
            return i;
        }
        return -1;
    }

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());      
        long ans = (n * (n - 1)) / 2; 
        Map<Integer, List<Integer>> mapper = new HashMap<>(); 
        StringTokenizer tk;
        int key = 0;
        for(int i = 0; i < 10; i++) {
            tk = new StringTokenizer(br.readLine());
            List<Integer> arr = new ArrayList<>();
            key = Integer.parseInt(tk.nextToken());
            while(tk.hasMoreTokens()) {
                arr.add(Integer.parseInt(tk.nextToken()));
            }
            mapper.put(key, arr);
        }

        for(Map.Entry<Integer, List<Integer>> entry: mapper.entrySet()) {
            key = entry.getKey();
            List<Integer> arrlst = entry.getValue();
            for(Integer i: arrlst) {
                if(mapper.containsKey(i)) {
                    List<Integer> arr = mapper.get(i);
                    if(arr.contains(key)) {
                        int pos = findPos(arr, key);
                        arr.remove(pos);
                        mapper.replace(i, arr);
                    }
                }
                ans--;
            }
        }
        System.out.println(ans);
    }
}
