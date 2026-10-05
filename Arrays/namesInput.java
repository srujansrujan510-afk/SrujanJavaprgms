package Arrays;

import java.util.Scanner;

public class namesInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
