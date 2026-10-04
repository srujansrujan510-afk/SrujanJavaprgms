package Arrays;
import java.util.Scanner;

public class AscendingOrderOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
       
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        boolean sorted= true;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                sorted=false;
                break;
            }
            
        }
        if(sorted){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
    
}
