import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
        
		int answer = 0;
		while(money > 0) {
			if(money % 5 == 0) {
				answer += money / 5;
				break;
			}
			money -= 2;
			answer++;
		}
        if(money < 0){
            System.out.println(-1);
        } else{
            System.out.println(answer);
        }
		
	}
}
