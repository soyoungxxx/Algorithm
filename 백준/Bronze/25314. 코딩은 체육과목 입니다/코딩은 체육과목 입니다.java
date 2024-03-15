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
		int N = Integer.parseInt(br.readLine());
		// long 하나당 4 바이트
		String longString = "long ";
		System.out.println(longString.repeat(N/4) + "int");
	}
}