import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int n = targets.length;
        int end = 0;
        int answer = 0;
        
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        System.out.println(targets[0][1]);
        for(int i = 0 ; i < n ;i++){
            int s = targets[i][0];
            int e = targets[i][1];
            if(s < end) continue;
            else {
                end = e;
                answer++;
            }
        }
        
        return answer;
    }
}