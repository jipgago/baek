import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String numbers = br.readLine();
        int[] num = new int[numbers.length()];
        for(int i = 0; i < numbers.length(); i++){
            num[i] = Integer.parseInt(numbers.substring(i, i+1));
        }
        Arrays.sort(num);
        for(int i = num.length-1; i>=0;i--){
            sb.append(String.valueOf(num[i]));
        }
        System.out.println(sb.toString());
    }
}