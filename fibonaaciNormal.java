
import java.util.Scanner;

public class fibonaaciNormal {
    static void fib(int n) {
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b);
        for(int i=2;i<=n;i++){
            
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c+" ");
        }
        
                
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
    
}
