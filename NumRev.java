import java.util.Scanner;

public class NumRev{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revnum = 0;
        int rem=0,div=0;
        
        
        while(num != 0){
            rem = num % 10;
            num = num / 10;
            revnum = revnum*10 + rem; 
        }
        
        System.out.println("Reverse number is : "+revnum);
    }
}