
import java.util.Scanner;

public class CountNumbersIntgers{
    static void CountNmbers(int n){
        int posiTive=0;
        int zeRo=0;
        int Negi=0;
        for(int i=1;i<=n;i++){
            System.out.println("enter a number:");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if(num==0){
                zeRo++;
                
            }
            else if(num>0){
                posiTive++;
            }
            else{
                Negi++;
            }
        }
        System.out.println("zero:"+zeRo);
        System.out.println("positive:"+posiTive);
        System.out.println("negetive:"+Negi);
        
    }
    public static void main(String[] args) {
        System.out.println("enter total number of times u want to enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CountNmbers(n);
    }
}