import java.util.*;
import java.io.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];
        int[] result = new int[7];
        for(int i = 0; i < 9; i++) arr[i] = Integer.parseInt(br.readLine());
        int sum = IntStream.of(arr).sum();
        for(int i = 0; i < 8; i++){
            if(IntStream.of(arr).sum() == 100) break;
            for(int j = i+1; j < 9; j++){
                if(sum - arr[i] - arr[j] == 100){
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    break;
                }
            }
        }
        for(int i = 0; i<7; i++){
            sb.append(String.valueOf(arr[i+2])).append("\n");
        }
        System.out.print(sb.toString());
    }
}