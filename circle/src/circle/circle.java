package circle;
import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the radius:");
	double radius=scan.nextDouble();
	double area=Math.PI*(radius*radius);
	System.out.println("The area of circle is"+area);
	double circumference=Math.PI*2*radius;
	System.out.println("The circumference of the circle"+circumference);

	}
}
