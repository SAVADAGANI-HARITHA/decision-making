package decitionmaking;
import java.util.Scanner;
public class question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		int x=sc.nextInt();
		System.out.println("Enter y");
		int y=sc.nextInt();
		System.out.println("Enter z");
		int z=sc.nextInt();
		System.out.println("Enter the lab allocated for ACE trainig");
		String lab=sc.next();
		if(x<y)
		{
			if(x<z)
			{
				System.out.println("L1 has the minimal seating capacity");
			}
			else if(x>z)
			{
				System.out.println("L3 has the minimal seating capacity");
			}
		}
		else
		{
			System.out.println("L2 has the minimal seating capacity");
		}

	}
}

