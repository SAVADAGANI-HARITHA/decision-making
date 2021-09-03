package decitionmaking;
import java.util.Scanner;
import java.lang.Math;
public class CircleIntersection {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x1=sc.nextInt();
	int y1=sc.nextInt();
	int r1=sc.nextInt();
	int x2=sc.nextInt();
	int y2=sc.nextInt();
	int r2=sc.nextInt();
	double power=Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
	double dis=Math.sqrt(power);
	float rad=r1-r2;
	if(dis<rad) {
		System.out.println("the circles will not overlap");
	}
		else if(dis==rad)
		{
		System.out.println("the circles are tangential");

		}
		else if(dis>rad)
		{
		System.out.println("the circles  overlap");

		}
	

		
	
	}

}
