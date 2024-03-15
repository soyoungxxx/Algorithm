import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int grape[] = new int[n];
		int dp[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			grape[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = grape[0];
		if (n > 1) {
			dp[1] = dp[0] + grape[1];
		}
		if (n > 2) {
			dp[2] = Math.max(grape[1] + grape[2], Math.max(dp[0] + grape[2],  dp[1]));
			// 초기값 설정
			
			for (int i = 3; i < n; i++) {
				int a = dp[i-1];
				int b = dp[i-2] + grape[i];
				int c = dp[i-3] + grape[i] + grape[i-1];
				
				dp[i] = Math.max(a, Math.max(b, c));
			}
		}
		System.out.println(dp[n - 1]);
	}
}
