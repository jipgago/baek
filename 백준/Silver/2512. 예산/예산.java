import java.util.*;
import java.util.stream.IntStream;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] index = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i < N; i ++) {
			index[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		
		int max = IntStream.of(index).max().orElse(0);
		int min = 0;
		int mid = 0;
		int answer = 0;
		while(min <= max) {
			mid = (min+max)/2;
			int sum = 0;
			
			for(int b : index) {
				if(b > mid) sum += mid;
				else sum += b;
			}
			if(sum <= M) {
				min = mid+1;
				answer = mid;
			} else max = mid - 1;
		}
		System.out.println(answer);
	}

}
