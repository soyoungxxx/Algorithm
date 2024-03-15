import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static boolean isVisitedDFS[];
	static boolean isVisitedBFS[];
	static ArrayList<Integer>[] list;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String num[] = br.readLine().split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			String sum = String.valueOf(a+b);
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}