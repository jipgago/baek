import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    static ArrayList<Integer> answer = new ArrayList<>();
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(int i = 1; i <= 1000000; i++){
            String str = Integer.toString(i);
            int str_value = 0;
            for(int j = 0; j<str.length(); j++){
                str_value += Integer.parseInt(String.valueOf(str.charAt(j)));
            }
            dfs(n,i,i+str_value);
        }
        int min = 0;
        if(answer.size()!=0){
            min = Collections.min(answer);
        }
        System.out.print(min);
    }
    
    public static void dfs(int n , int value, int sum){
        if(sum == n){
            answer.add(value);
            return;
        }
    }
}