import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger a_big = new BigInteger(a);
        BigInteger b_big = new BigInteger(b);
        return a_big.add(b_big).toString();
    }
}