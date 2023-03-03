import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long X = Long.parseLong(st.nextToken());
		long Y = Long.parseLong(st.nextToken());
		int Z = getPercent(X, Y);
		
		int max = (int) 1e9;
		int min = 1;
		int answer = -1;
		while(max >= min) {
			int mid = (max + min) / 2;
			
			int percent = getPercent(X + mid, Y + mid);
			
			if(percent != Z) {
				answer = mid;
				max = mid - 1;
			}
			else min = mid + 1;
			
		}
		System.out.println(answer);
		
	}
	
	public static int getPercent(long x, long y) {
		return (int) ((long)y * 100 / x);
	}
}
