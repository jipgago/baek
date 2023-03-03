import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] voca = new String[N];
        for(int i = 0; i < voca.length; i++){
            voca[i] = br.readLine();
        }
        Arrays.sort(voca, (s1, s2) -> s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length());
        for(int i = 0; i < voca.length; i++){
        	if(i >= 1 && voca[i].equals(voca[i-1]) ) continue;
            sb.append(voca[i] + "\n");
        }
        System.out.println(sb.toString());
    }
}