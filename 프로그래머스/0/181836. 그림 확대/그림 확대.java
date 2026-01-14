class Solution {
    public String[] solution(String[] picture, int k) {
        int n = picture.length;
        String[] result = new String[n * k];
        int idx = 0;

        for (String row : picture) {
            StringBuilder expanded = new StringBuilder();
            for (char c : row.toCharArray()) {
                expanded.append(String.valueOf(c).repeat(k));
            }

            for (int i = 0; i < k; i++) {
                result[idx++] = expanded.toString();
            }
        }

        return result;
    }
}