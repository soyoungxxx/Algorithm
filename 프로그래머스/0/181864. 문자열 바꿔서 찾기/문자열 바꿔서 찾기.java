class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            String str = Character.toString(myString.charAt(i));
            if (str.equals("A")) sb.append("B");
            else if (str.equals("B")) sb.append("A");
        }
        if (sb.toString().contains(pat)) answer = 1;
        return answer;
    }
}