import java.util.*;
public class votingElligebility {
    static void voting(int n){
        if(n>=18){
            System.out.println("elligible to vote");
        }
        else{
            System.out.println("not elligible to vote");
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        voting(n);
    }
}
