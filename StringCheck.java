//06th sep

import java.util.Scanner;

public class StringCheck{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.charAt(0) == 'A' && str.charAt(str.length()-1) == 't'){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}