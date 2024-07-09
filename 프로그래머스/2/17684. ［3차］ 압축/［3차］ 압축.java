import java.util.*;

class Solution {
    private Map<String, Integer> dict = new HashMap<>();
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        int index = 27;
        
        initDict();
        
        int len = msg.length();
        int startIndex = 0, endIndex = 1, count = 0;
        while (startIndex < len && endIndex <= len) {
            String str = msg.substring(startIndex, endIndex);
            if (dict.get(str) != null) {
                if (endIndex == len) {
                    list.add(dict.get(str));
                    break;
                }
                endIndex++;
                count++;
                continue;
            } else {
                String prevString = msg.substring(startIndex, endIndex-1);
                list.add(dict.get(prevString));
                
                // 사전에 추가, index + 1
                dict.put(str, index);
                index += 1;
                startIndex += count;
                count = 0;
            }
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
    
    private void initDict() {
        for (int i = 1; i <= 26; i++) {
            String word = Character.toString('A' + (i - 1));
            dict.put(word, i);
        }
    }
}