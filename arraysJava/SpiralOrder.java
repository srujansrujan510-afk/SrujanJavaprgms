package TwoDArrays;

import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("THe spiral order is:");
    int srow=0;
    int erow=n-1;
    int scol=0;
    int ecol=m-1;
    while(srow<=erow && scol<=ecol){
        for(int j=scol;j<=ecol;j++){
            System.out.println(a[srow][j]);
        }
        srow++;
        for(int i=srow;i<=erow;i++){
            System.out.println(a[i][ecol]);
        }
        ecol--;
        for(int j=ecol;j>=scol;j--){
            System.out.println(a[erow][j]);
        }
        erow--;
        for(int i=erow;i>=srow;i--){
            System.out.println(a[i][scol]);
        }
        scol++;
        System.out.println();
    }

    
}
}
