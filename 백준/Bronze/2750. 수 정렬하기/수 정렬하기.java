import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int data[] = new int[size];
        for(int i = 0; i < size; i++){
            data[i] = sc.nextInt();
        }
        
        bubblesort(data, size);
        for(int i = 0; i < size; i++){
            System.out.println(data[i]);
        }
    }
    public static void bubblesort(int a_data[], int a_count){
        int step, i, temp = 0;
        for(step = 0; step < a_count -1; step++){
            for(i = 0; i < a_count - step -1; i++){
                if(a_data[i] > a_data[i+1]){
                    temp = a_data[i];
                    a_data[i] = a_data[i+1];
                    a_data[i+1] = temp;
                }
            }
        }
    }
}