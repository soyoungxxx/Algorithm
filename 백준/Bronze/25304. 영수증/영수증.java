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
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		int sum = 0;
		for (int i = 0; i < N; i++) {
			String priceAndCount[] = br.readLine().split(" ");
			int price = Integer.parseInt(priceAndCount[0]);
			int count = Integer.parseInt(priceAndCount[1]);
			sum += price * count;
		}
		
		if (sum == X) System.out.println("Yes");
		else System.out.println("No");
	}
}