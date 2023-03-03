import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = 1;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if(L == 0 && P == 0 && V == 0) break;
            calCase(L, P, V, index);
            index++;
        }
    }
    public static void calCase(int l, int p, int v ,int index){
        int answer = 0;
        answer = (v / p) * l;
        answer += Math.min(l, v%p);
        System.out.println("Case " + index + ": " + answer);
    }
}