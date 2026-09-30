package arrayssJava;
import java.util.*;
public class FindIndex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==x){
                System.out.println("the x value index is:"+i);
            }
        }
    }
}