package multiply;
import java.util.Scanner;
public class multiple {

	public static void main(String[] args) {
		Scanner Scanin=new Scanner(System.in);
		System.out.println("Enter a Value For i...");
		int i=Scanin.nextInt();
		System.out.println("Enter a Value for j...");
		int j=Scanin.nextInt();
		int mul=i*j;
		System.out.println("The Multiple of i and j is...."+ mul);
	}

}
