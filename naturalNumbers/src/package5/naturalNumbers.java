package package5;

import java.util.Scanner;
public class naturalNumbers {

	public static void main(String[] args) {
		int i=1, sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number=>");
		int num = scanner.nextInt();
		
		while(i<=num) {
		sum = sum + i;
		i++;
		}
		System.out.println("Sum = "+sum);
	}
}
