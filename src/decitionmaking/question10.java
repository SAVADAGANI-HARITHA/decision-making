package decitionmaking;
import java.util.Scanner;
public class question10 {

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
			System.out.println("L1 should be allocated to this class");
		}
		else if(y>=n)
		{
			System.out.println("L2 should be allocated to this class");
		}
		else if(z>=n)
		{
			System.out.println("L3 should be allocated to this class");
		}
		else
		{
			System.out.println("None of the labs can be allocated");
		}
		


	}

}
