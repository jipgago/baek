import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(win_nums);
        int count = 0;
        int zerocnt = 0;
        for(int i = 0; i < lottos.length; i++){
            if(Arrays.binarySearch(win_nums, lottos[i]) > -1) count++;
            if(lottos[i] == 0) zerocnt++;
        }
        
        int[] answer = new int[2];
        
        int maxRank = count + zerocnt;
        int minRank = count;
        System.out.println(maxRank);
        System.out.println(minRank);
        
        answer[0] = calNum(maxRank);
        answer[1] = calNum(minRank);
        
        return answer;
    }
    
    public int calNum(int n){
        int result = 0;
        switch(n){
            case 6:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 4:
                result = 3;
                break;
            case 3:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            case 1:
                result = 6;
                break;
            case 0:
                result = 6;
                break;
        }
        return result;
    }
}