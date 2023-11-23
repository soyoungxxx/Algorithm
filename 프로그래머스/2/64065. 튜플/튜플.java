import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        List<Integer> answer_list = new ArrayList<>();
        
        int len = s.length();
        s = s.substring(2, (len - 2));
        // 앞 뒤 {{}} 제거
    
        String[] str = s.split("\\},\\{");
        
        Arrays.sort(str, (String s1, String s2) -> s1.length() - s2.length());
        
        for (int i = 0; i < str.length; i++) {
            String[] tmp = str[i].split(",");
            for (int j = 0; j < tmp.length; j++) {
                int num = Integer.parseInt(tmp[j]);
                if (answer_list.contains(num)) {
                    continue;
                }
                answer_list.add(num);
            }
        }
        
        answer = answer_list.stream()
	            .mapToInt(Integer::intValue)
    	        .toArray();

        return answer;
    }
}