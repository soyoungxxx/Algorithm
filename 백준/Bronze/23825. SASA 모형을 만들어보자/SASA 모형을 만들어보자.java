import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs  = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int a = N / 2;
        int b = M / 2;
        System.out.println(Math.min(a,b));

    }
}
