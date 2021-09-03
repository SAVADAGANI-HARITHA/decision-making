package decitionmaking;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
	System.out.println("ENTER THE TWO INTEGERS");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a<b)
	{
		System.out.println(+a+ "is less than" +b);
	}
		else if(a>b)
		{
			System.out.println(+a+ "is geater tha" +b);
		}
		else
		{
			System.out.println(+a+ "is equal to" +b);
		}
	   
	}

}
