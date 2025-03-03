import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static String skWin = "SK", cyWin = "CY";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        if (N % 2 == 0) System.out.println(cyWin);
        else System.out.println(skWin);
    }
}