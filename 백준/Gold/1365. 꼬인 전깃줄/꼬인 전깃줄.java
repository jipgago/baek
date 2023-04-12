import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(0);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0 ; i < N; i++) {
			int cur = Integer.parseInt(st.nextToken());
			if(ts.last() > cur) ts.remove(ts.ceiling(cur));
			ts.add(cur);
		}	
		System.out.println(N - (ts.size()-1));
	}
}