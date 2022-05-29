package package7;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		int reverse=0, remainder, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number=>");
		int num=scanner.nextInt();
		temp=num;
		
		for(; num!=0; num=num/10) {
			remainder = num%10;
			reverse = reverse*10+remainder;
		}
		if (temp == reverse)
		System.out.println("The Number is Palindrome");
		else
			System.out.println("The Number is Not Palindrome");
	}
}
