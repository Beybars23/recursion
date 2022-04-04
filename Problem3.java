import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        prime(N);
    }
    static void prime(int N){
        for(int i = 2; i < N;i++){
            if(N<=1){
                System.out.println("NotPrime");
            }
            else if(N % i == 0){
                System.out.println("Composite");
            }
            else{
                System.out.println("Prime");
                break;
            }
        }
    }
}
