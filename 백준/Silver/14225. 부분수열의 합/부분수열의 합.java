import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	
	static int N, sum;
	static int S[];
	static HashSet<Integer> result;
	static boolean chkNumber[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = new int[N];
		result = new HashSet<Integer>(100001);
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			S[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0,0);
		chkNumber = new boolean[1000001];
		for(int i = 0; i < result.size(); i++) {
			chkNumber[i] = result.contains(i);
			if(!chkNumber[i]) {
				System.out.println(i);
				break;
			} else if(i == result.size()-1 && chkNumber[i]) {
				System.out.println(i+1);
			}
		}

	}
	public static void dfs(int start, int depth) {
		if(start == N) {
			sum = depth;
			result.add(sum);
			return;
		}
		dfs(start+1, depth+S[start]);
		dfs(start+1, depth);
	}

}
