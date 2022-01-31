package swap;

public class swaptwonumbers {
	public static void main(String[] args)
	{
		float first=2.30f, second=4.30f;
		System.out.println("------Before swap-------");
		System.out.println("First number="+ first);	
		System.out.println("Second number="+ second);
		float temporary=first;
		first=second;
		second=temporary;
		System.out.println("------After swap-------");
		System.out.println("First number="+ first);	
		System.out.println("Second number="+ second);
	}

}
