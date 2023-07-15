import java.util.*;
import java.io.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        for(int i =0; i < 3; i++)arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        for(int i =0; i < 3; i++) sb.append(String.valueOf(arr[i])).append(" ");
        System.out.print(sb.toString());
    }
}