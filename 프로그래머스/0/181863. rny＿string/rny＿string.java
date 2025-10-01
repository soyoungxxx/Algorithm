class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rny_string.length(); i++) {
            String str = Character.toString(rny_string.charAt(i));
            if (str.equals("m")) sb.append("rn");
            else sb.append(str);
        }
        return sb.toString();
    }
}