import java.util.*;
import java.io.*;

class Numbering implements Comparable<Numbering> {
    int a;
    int b;
    Numbering(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int compareTo(Numbering o){
        return this.a == o.a ? this.b - o.b : this.a - o.a;
    }
    
    
    public void print(){
        System.out.println(this.a + " " + this.b);
    }
}

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Numbering> list = new PriorityQueue<>();
        for(int i = 0 ; i< N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new Numbering(a, b));
        }

        while(!list.isEmpty()){
            Numbering a = list.poll();
            a.print();
        }
    }
}