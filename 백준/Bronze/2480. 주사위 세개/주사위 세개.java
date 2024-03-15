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
		String rollTheDice[] = br.readLine().split(" ");
		int a = Integer.parseInt(rollTheDice[0]);
		int b = Integer.parseInt(rollTheDice[1]);
		int c = Integer.parseInt(rollTheDice[2]);
		int price = 0;
		
		if (a == b && b == c) {
			price = 10000 + (a * 1000);
		}
		else if (a != b && b != c && a != c) {
			int maxNum = Math.max(a, Math.max(b, c));
			price = maxNum * 100;
		}
		else {
			if (a == b || a == c) {
				price = 1000 + a * 100;
			}
			else if (b == c) {
				price = 1000 + c * 100;
			}
		}
		System.out.println(price);
	}
}