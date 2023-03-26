import java.util.*;
import java.util.Map.Entry;

public class Solution {
    public static long solution(String s) {
        Map<Character, Map<Integer, Integer>> lumps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!lumps.containsKey(c)) {
                lumps.put(c, new HashMap<>());
            }
            int j = i + 1;
            while (j < s.length() && s.charAt(j) == c) {
                j++;
            }
            int len = j - i;
            Map<Integer, Integer> freq = lumps.get(c);
            freq.put(len, freq.getOrDefault(len, 0) + 1);
            i = j - 1;
        }
        int n = s.length();
        long unpretty = ((long) (n - 1)) * n * (n + 1) / 6;
        for (Map<Integer, Integer> lump : lumps.values()) {
            int total = 0;
            int both_side = 0;
            for (Entry<Integer, Integer> entry : lump.entrySet()) {
                int l = entry.getKey();
                int count = entry.getValue();
                total += l * count;
                both_side += count;
            }
            for (int i = 1; i <= Collections.max(lump.keySet()); i++) {
                unpretty -= (long) total * (total - 1) / 2;
                total -= both_side;
                both_side -= lump.getOrDefault(i, 0);
            }
        }
        return unpretty;
    }
}
