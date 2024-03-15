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
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		int three = num1 * (num2 % 100 % 10);
		int four = num1 * (num2 / 10 % 10);
		int five = num1 * (num2 / 100);
		int six = num1 * num2;
		
		System.out.printf("%d\n%d\n%d\n%d\n", three, four, five, six);
	}
}