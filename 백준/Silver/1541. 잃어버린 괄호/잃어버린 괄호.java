import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("-");
        List<Integer> list = new ArrayList<>();
        // + 먼저 계산
        for (int i = 0; i < str.length; i++) {
            try {
                int num = Integer.parseInt(str[i]);
                list.add(num);
            } catch(Exception e) {
                String[] str2 = str[i].split("\\+");
                int num2 = 0;
                for (int j = 0; j < str2.length; j++) {
                    num2 += Integer.parseInt(str2[j]);
                }
                list.add(num2);
            }
        }
        int answer = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            answer -= list.get(i);
        }
        System.out.println(answer);
    }
}