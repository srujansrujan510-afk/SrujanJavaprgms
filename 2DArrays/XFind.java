package TwoDArrays;

import java.util.Scanner;

public class XFind {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows:");
        int rows=sc.nextInt();
        System.out.println("enter columns:");
        int coulumns=sc.nextInt();
        int a[][]=new int[rows][coulumns];
        System.out.println("enter values:");
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
        System.out.println("Enter value to search:");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<coulumns;j++){
                if(a[i][j]==x){
                    System.out.println("X indices:"+i+","+j);
                }
            }
        }


    }

    
}
