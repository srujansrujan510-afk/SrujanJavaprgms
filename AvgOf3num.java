import java.util.*;
public class AvgOf3num {
    public static void Avg(int a,int b,int c){
        int avg=(a+b+c)/3;
        System.out.println("Average of 3 numbers:"+avg);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Avg(a,b,c);

    }
    
}
