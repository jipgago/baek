import java.util.*;
import java.io.*;
import java.util.stream.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < 2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                switch(i){
                    case 0:
                        A[j] = Integer.parseInt(st.nextToken());
                        break;
                    case 1:
                        B[j] = Integer.parseInt(st.nextToken());
                        break;
                }
            }
        }
        //여기까지 입력
        Arrays.sort(A);
        Arrays.sort(B);
        
        int index = B.length-1;
        int count = 0;
        
        for(int i =0; i<A.length; i++){
            count += A[i] * B[index];
            index--;
        }
        System.out.println(count);
    }
}