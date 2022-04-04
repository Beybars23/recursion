import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int result = factorial(N);
        System.out.println(result);

    }
    public static int factorial(int N){
        if(N<=1){
            return 1;
        }
        return factorial(N-1) * N;
    }
}
