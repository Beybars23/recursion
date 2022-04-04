import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        int result = degree(a,n);
        System.out.println(result);
    }
    public static int degree(int a,int n){
        if(n==1){
            return a;
        }
        else if(n == 0) {
            return 1;
        }
        return degree(a, n-1)*a;
    }
}
