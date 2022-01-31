package flotriangle;

import java.util.Scanner;

class flotrian {

	public static void main(String[] args) {
	int rows,number=1,counter,j;
	Scanner Input=new Scanner(System.in);
	System.out.println("Enter the number f Rows for Floyd's Triaangle");
	rows=Input.nextInt();
	System.out.println("floyd's trisngle");
	System.out.println("*************************");
   for(counter = 1;counter<=rows;counter++)
   {
	   for(j=1;j<=counter;j++)
	   {
		   System.out.print(number+" ");
		   number++;
	   }
	   System.out.println();
	   }
   }
	}


