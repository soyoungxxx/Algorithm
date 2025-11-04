class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        int x = 0, c = 0;

        for (String t : terms) {
            if (t.contains("x")) {
                x += t.equals("x") ? 1 : Integer.parseInt(t.replace("x", ""));
            } else {
                c += Integer.parseInt(t);
            }
        }

        if (x == 0) return String.valueOf(c);
        if (c == 0) return x == 1 ? "x" : x + "x";
        return (x == 1 ? "x" : x + "x") + " + " + c;
    }
}