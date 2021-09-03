package decitionmaking;
import java.util.Scanner;
public class question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the current year");
		int currentYear=sc.nextInt();
		System.out.println("Enter the birth year");
		int birthYear=sc.nextInt();
		int age;
		if(currentYear>birthYear)
		{
			age=currentYear-birthYear;
			System.out.println("your age:"+age);
		}
		else if(currentYear<birthYear)
		{
			age=(currentYear+100)-birthYear;
			System.out.println("your age:"+age);
		}

	}

}
