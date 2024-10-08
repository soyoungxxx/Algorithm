import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        Long N = Long.parseLong(inputs[0]);
        Long M = Long.parseLong(inputs[1]);
        bw.write(Long.toString(Math.abs(N-M)));
        bw.flush();
        bw.close();
    }
}