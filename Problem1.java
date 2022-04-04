import java.util.Scanner;
public class Problem1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int N = scan.nextInt();
        min(N);


    }

    static void min(int N){
        int[] arr = new int [N];
        for(int i = 0; i < N; i++){
            arr[i]= scan.nextInt();
        }
        int minimum=10000;
        for(int i = 0;i <N;i++){
            if(minimum >arr[i]){
                minimum=arr[i];
            }
        }
        System.out.println(minimum);
    }
}
