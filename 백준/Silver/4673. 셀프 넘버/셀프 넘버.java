
public class Main {
	static StringBuilder sb;
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		 
		for (int i = 1; i < 10001; i++){
			int n = d(i);
		
			if(n < 10001){
				check[n] = true;
			}
		}
 
		sb = new StringBuilder();
        
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
 
 
 
	public static int d(int number){
		int sum = number;
    
		while(number != 0){
			sum += (number % 10);
			number /= 10;
		}
    
		return sum;
	}
}
