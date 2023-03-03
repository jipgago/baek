import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> nums = new PriorityQueue<Integer>();
        for(int i = 0 ; i < N; i++){
            nums.add(Integer.parseInt(br.readLine()));
        }
        while(nums.size() > 1){
            int temp1 = nums.poll();
            int temp2 = nums.poll();
            
            sum += temp1 + temp2;
            nums.add(temp1 + temp2);
        }
        System.out.println(sum);
    }
}