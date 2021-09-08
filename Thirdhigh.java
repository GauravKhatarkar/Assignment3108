//31 aug

import java.util.Scanner;

public class Thirdhigh{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array - ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array - ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int first,second,third;
        first = second = third = arr[0];
        
        for(int i=1;i<n;i++){
           
           if(arr[i]>first){
               third = second;
               second = first;
               first = arr[i];
           }else if(arr[i]>second){
               third = second;
               second = arr[i];
           }else if(arr[i]>third){
               third = arr[i];
           }
            
        }
        System.out.println("third high is - "+third);
    }
}