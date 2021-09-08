//31aug

import java.util.Scanner;

public class Armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int rem=0,sum=0;
        while(n != 0){
            rem = n % 10;
            n = n/10;
            sum += rem*rem*rem;
        }
        if(sum==num){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is not Armstrong");
        }
    }
}