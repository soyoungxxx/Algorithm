import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] arr = new int[N];
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int I = Integer.parseInt(input[0]);
            int J = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);
            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}