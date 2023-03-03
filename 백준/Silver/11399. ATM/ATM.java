import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i< N; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);
        int count = 0;
        for(int i = 0; i < N; i++ ){
        	if(i < N-1) {
        		time[i+1] += time[i];
        	}
        	count += time[i];
        }
        System.out.println(count);
    }
}