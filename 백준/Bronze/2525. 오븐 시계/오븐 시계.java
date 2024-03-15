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
		String time[] = br.readLine().split(" ");
		int currentHour = Integer.parseInt(time[0]);
		int currentMin = Integer.parseInt(time[1]);
		int needMin = Integer.parseInt(br.readLine());
		currentMin += needMin;
		while (currentMin >= 60) {
			currentMin -= 60;
			currentHour += 1;
			if (currentHour >= 24) currentHour -= 24;
		}
		System.out.println(currentHour + " " + currentMin);
	}
}