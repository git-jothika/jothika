package square;
import java.util.Scanner;
class square {
	public static void main(String[] args)
	{
		System.out.println("Enter side of Square");
		Scanner scan=new Scanner(System.in);
		double side=scan.nextDouble();
		double area=side*side;
		System.out.println("Area of Square"+area);
		
	}

}
