
import java.util.Scanner;

public class power {
    static void powerz(int x,int n) {
        int result=1;
        for(int i=0;i<n;i++){
            result*=x;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        powerz(x,n);
    }
    
}
