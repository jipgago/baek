import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        if(num==4 || num == 7) answer = -1;
	    else if(num % 5 == 0) answer = num / 5;
	    else if(num % 5 == 1 || num % 5 ==3) answer = num / 5 + 1;
	    else if(num % 5 == 2 || num % 5 ==4) answer = num / 5 + 2;
        System.out.println(answer);
        
    }
}