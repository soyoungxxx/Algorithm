class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = 0;
        boolean plus = true;
        for (int i = 0; i < str.length; i++) {
            try {
                int num = Integer.parseInt(str[i]);
                if(plus) answer += num;
                else answer -= num;
            } catch(Exception e) {
                switch(str[i]) {
                    case "+" :
                        plus = true;
                        break;
                    case "-" :
                        plus = false;
                        break;
                }
            }
        }
        return answer;
    }
}