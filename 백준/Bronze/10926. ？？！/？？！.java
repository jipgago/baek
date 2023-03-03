import java.util.*;
import java.io.*;

public class Main{
    public static String boom = "??!";
    public static String name;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        
        System.out.println(name + boom);
        
    }
}