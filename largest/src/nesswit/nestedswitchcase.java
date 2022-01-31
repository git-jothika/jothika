package nesswit;

public class nestedswitchcase {

	public static void main(String[] args) {

		int tech=2,course=2;
		switch(tech) {
		case 1:
		{
			System.out.println("java");
			break;
		}
		case 2:
			switch(course)
		{
			case 1:
			{
			System.out.println("j2EE");
		break;
			}
	       case 2:
	       {
		System.out.println("Advanced java");
	break;
		}
	}
		}
	}
}
