import java.util.Scanner;
public class Problem10 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(binomial( n,k));


    }
    public static int binomial(int n, int k){
        if (k > n)
            return 0;
        if (k == 0 || k == n)
            return 1;


        return binomial(n - 1, k - 1)
                + binomial(n - 1, k);
    }
}
