import java.util.Scanner;
public class Problem2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int N = scan.nextInt();
        average(N);
    }
    static void average(int N){
        int[] arr = new int [N];
        for(int i = 0; i < N; i++){
            arr[i]= scan.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += arr[i];
        }
        float result = sum/N;
        System.out.println(result);
    }
}
