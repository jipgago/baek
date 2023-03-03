import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> ranking = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];
        int[] sort = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int value = Integer.parseInt(st.nextToken());
            origin[i] = value;
            sort[i] = value;
        }
        Arrays.sort(sort);
        int rank = 0;
        for(int k : sort){
            if(!ranking.containsKey(k)){
                ranking.put(k, rank);
                rank++;
            }
        }
        for(int key : origin) sb.append(ranking.get(key) + " ");
        System.out.println(sb.toString());
    }
}