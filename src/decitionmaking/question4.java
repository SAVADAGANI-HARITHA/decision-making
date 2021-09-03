package decitionmaking;
import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price of a dozen mangoes");
		float p=sc.nextFloat();
		System.out.println("Enter the Price at which 1 mango is being sold");
		float sp=sc.nextFloat();
		float cp=p/12;
		if(cp>sp)
		{
			System.out.printf(" Loss:Rs.%.2f",12*(cp-sp));
		}
		else if(cp<sp)
		{
			System.out.printf("Profit:Rs.%.2f",12*(sp-cp));
		}
		else
		{
			System.out.println("no profit or no loss");
		}
	}

}
