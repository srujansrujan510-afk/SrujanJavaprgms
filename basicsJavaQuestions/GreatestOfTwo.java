import java.util.*;
public class GreatestOfTwo{
    public static void grttwo(int a,int b) {
        if(a>b){
            System.err.println("a is greater");
        }
        else{
            System.out.println("b is grtr");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        grttwo(a,b);
    }
}