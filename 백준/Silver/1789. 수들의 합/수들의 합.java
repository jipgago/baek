import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        long sum = 0L;
        int i = 0;
        int count = 0;
        while(true){
            sum += ++i;
            if(num < sum){
                System.out.println(count);
                break;
            } 
            count++;
        }
    }
}