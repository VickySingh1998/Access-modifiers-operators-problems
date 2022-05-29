package newproject;

import java.util.Scanner;

public class vowel {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in); {
			System.out.print("Enter Alphabet=> ");
			char letter= scanner.next().charAt(0);
			
			switch (letter) {
			case 'a':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.print("It's a vowel");
				break;
			default:
				System.out.print("It's not a vowel");
			}
		}
	}
}