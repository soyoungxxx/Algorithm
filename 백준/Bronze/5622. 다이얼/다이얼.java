import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb.append(br.readLine());
        String[] number = {" ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "+-*/"};
        int len = sb.length();
        int time = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 10; j++) {
                if (number[j].contains(Character.toString(sb.charAt(i)))) {
                    time += j + 2;
                    break;
                }
            }
        }
        System.out.println(time);
    }
}
