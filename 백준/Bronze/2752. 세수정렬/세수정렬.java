import java.util.*;
import java.io.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n1, n2, n3, temp;
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
        n3 = Integer.parseInt(st.nextToken());
        if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n2 > n3) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        sb.append(n1).append(" ").append(n2).append(" ").append(n3);
        System.out.print(sb.toString());
    }
}