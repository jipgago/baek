import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            rank.put(players[i], i);
        }
        for(String name : callings){
            int curPlayer = rank.get(name);
            String beforePlayer = players[curPlayer-1];
            
            players[curPlayer-1] = name;
            players[curPlayer] = beforePlayer;
            
            rank.put(name, curPlayer-1);
            rank.put(beforePlayer, curPlayer);
            // for(int i = 0; i < players.length; i++){
            //     if(name.equals(players[i])) {
            //         String temp = players[i-1];
            //         players[i-1] = players[i];
            //         players[i] = temp;
            //         break;
            //     } 
            // }
        }
        return players;
    }
}