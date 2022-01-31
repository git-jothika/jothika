package rect;
import java.util.Scanner;
class rectangle 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the legnth of rectangle");
	double length=scan.nextDouble();
	System.out.println("Enter the width of rectangle");
	double width=scan.nextDouble();
	double area=length*width;
	System.out.println("Area of rectangle is:"+area);		
}
}
