package decitionmaking;
import java.util.Scanner;
public class question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		int x=sc.nextInt();
		System.out.println("Enter y");
		int y=sc.nextInt();
		System.out.println("Enter z");
		int z=sc.nextInt();
		System.out.println("Enter n");
		int n=sc.nextInt();
		if(x>=n)
		{
			if(y>=n)
			{
				if(z>=n)
				{
					System.out.println("3 labs can accomodate" +n+ "students");
				}
				else
				{
					System.out.println("2 labs can accomodate" +n+ "students");
				}
			}
				else
				{
					System.out.println("1 labs can accomodate" +n+ "students");
				}
			}
			
			else
			{
				System.out.println("None of the labs can accomodate" +n+ "students");
			}
		
	}
}