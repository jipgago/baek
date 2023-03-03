import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num = br.readLine();
        boolean zero = false;
        int sum = 0;
        String[] number = new String[num.length()];
        for(int i = 0; i < num.length(); i++){
            number[i] = num.substring(i, i+1);
            sum += Integer.parseInt(number[i]);
            if(number[i].equals("0")) zero = true;
        }
        if(!zero || sum % 3 != 0) {
            System.out.println(-1);
            System.exit(0);
        } 
        Arrays.sort(number);
        for(int i = number.length-1; i >= 0; i--){
            String sortNum = number[i];
            sb.append(sortNum);
        }
        System.out.println(sb.toString());
    }
}