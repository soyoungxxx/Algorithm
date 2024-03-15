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
		String num[] = br.readLine().split(" ");
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(num[i]);
			if (number == v) count += 1;
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}