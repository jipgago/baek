class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length;i++){
            int num = absolutes[i];
            if(signs[i] == true) answer += num;
            else answer += (num - (num*2));
        }
        
        return answer;
    }
}