import java.util.*;

class Solution {
    private String[] words = {"A", "E", "I", "O", "U"};
    private Map<String, Integer> dict = new HashMap<>();
    private int num = 0;
    
    public int solution(String word) {
        int answer = 0;
        for (String str : words) {
            fillDict(str, 0);
        }
        answer = dict.get(word);
        return answer;
    }
    
    private void fillDict(String word, int index) {
        if (word.length() > 5) return;
        
        num += 1;
        dict.put(word, num);
        
        if (word.length() == 5) return;
        
        for (int i = index; i < words.length; i++) {
            String temp = word + words[i];
            fillDict(temp, index);
        }
    }
}