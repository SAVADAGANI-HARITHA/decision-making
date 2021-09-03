package decitionmaking;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the tuition fee");
		float t=sc.nextFloat();
		System.out.println("Enter the bus fee");
		float b=sc.nextFloat();
		System.out.println("Enter the hostel fee");
		float h=sc.nextFloat();
		switch (name)
		{
		case"MSDS":float fee=t+b;
		System.out.printf("the fees to be paid by the student is Rs%.2f.",fee);
		break;
		case"MSH":float fee1=t+h;
		System.out.printf("the fees to be paid by the student is Rs.%.2f",fee1);
		
		break;
		case"SGSDS":double fee2=1.5*t+b;
		System.out.printf("the fees to be paid by the student is Rs.%.2f",fee2);
		break;
		case"MGSH":double fee3=1.5*t+h;
		System.out.printf("the fees to be paid by the student is Rs.%.2f",fee3);
		break;
		
		}
		
	
		
		
		
		
		

	}

}
