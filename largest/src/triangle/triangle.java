package triangle;
import java.util.Scanner;
class triangle {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the width of triangle ");
	double base=scan.nextDouble();
	System.out.println("Enter the width of triangle ");
	double height=scan.nextDouble();
	double area=(base*height)/2;
	System.out.println("Area of triangle is:"+ area);		
}
}
