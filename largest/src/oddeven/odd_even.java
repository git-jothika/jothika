package oddeven;

import java.util.Scanner;

import java.util.Scanner;
public class odd_even {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = reader.nextInt();
		if(num%2==0)
			System.out.println(num + "is Even");
		else
		System.out.println(num + "is Odd");
	}
}

