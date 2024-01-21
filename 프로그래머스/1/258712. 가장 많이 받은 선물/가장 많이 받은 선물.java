import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] gift = new int [friends.length][friends.length];
        int[] score = new int[friends.length];
        
        for(String idx : gifts){
            StringTokenizer st = new StringTokenizer(idx);
            String give = st.nextToken().toString();
            String receive = st.nextToken().toString();
            int giveIdx = 0;
            int receiveIdx = 0;
            for(int i = 0; i < friends.length; i++){
                if(friends[i].equals(give)){
                    giveIdx = i;
                } else if(friends[i].equals(receive)){
                    receiveIdx = i;
                }
            }
            gift[giveIdx][receiveIdx] += 1;
            score[giveIdx] += 1;
            score[receiveIdx] -= 1;
        }
        for ( int i =0; i< friends.length; i++) {
            int num = 0;
            for ( int j = 0; j< friends.length; j++) {
                if ( i == j) {
                    continue;
                }    
                
                if (gift[i][j] > gift[j][i] ||
                     (gift[i][j] == gift[j][i] && score[i] > score[j])) {
                        num++;
                    }
            }
            
            if ( answer < num) {
                answer = num;
            }
            
        }
        return answer;
    }
}