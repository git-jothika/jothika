package whiledemon;
import java.util.Scanner;
public class demon {

	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("n please Enter any integer value below 10:");
		number=sc.nextInt();
		while(number<=10) {
			sum=sum+number;
		number++;
	}

 System.out.format("Sum of number from the while loop is %d",sum);
	}

}
