import java.util.*;
import java.io.*;

public class Main{
    public static double num1, num2;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        num1 = Double.parseDouble(st.nextToken());
        num2 = Double.parseDouble(st.nextToken());
        double answer = num1 / num2;
        System.out.println(answer);
        
    }
}