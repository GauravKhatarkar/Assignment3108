//02th sep

import java.util.Scanner;

public class ScoresAverage
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		System.out.println("Enter scores : ");
		for (int i=0;i<5;i++)
		{
			score[i] = sc.nextInt();
		}
		int average,sum=0;
		for(int i=0;i<5;i++){
			sum += score[i];
		}
		average = sum / 5;
        
		System.out.println("Average marks is :"+average);
	}
}