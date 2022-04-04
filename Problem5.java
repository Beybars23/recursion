import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int result = fibonacci(N);
        System.out.println(result);
    }
    public static int fibonacci(int N){
        if(N<=1){
            return N;
        }
        return fibonacci(N-2) + fibonacci(N-1);
    }
}
