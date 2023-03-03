import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int K = Integer.parseInt(st.nextToken()); 
		int N = Integer.parseInt(st.nextToken()); 
 
		int[] arr = new int[K];
		
		long max = 0;
		
		// 입력과 동시에 해당 랜선의 길이가 최댓값인지를 확인하고 max를 갱신
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());

		}
        max = IntStream.of(arr).max().orElse(0);
		max++; 
 
		long min = 0; 
		long mid = 0; 
 
		while (min < max) { 
			mid = (max + min) / 2;
			long count = 0;
			for (int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}
			if(count < N) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
			
 
		}
		
		System.out.println(min - 1);
	}
	
}
