import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] number = new int[3];
        for(int i = 0; i < 3; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(number);
        System.out.println(number[1]);
    }
}