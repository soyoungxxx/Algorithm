import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character key : map.keySet()) {
            if (map.get(key) == 1) sb.append(key);
        }
        
        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);
        String answer = new String(chars);
        
        return answer;
    }
}