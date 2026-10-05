package TwoDArrays;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int coulumns=sc.nextInt();
        int a[][]=new int[rows][coulumns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<coulumns;j++){
                a[i][j]=sc.nextInt();
            }
            
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<coulumns;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        }
    
}
