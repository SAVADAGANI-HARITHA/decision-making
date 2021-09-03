package decitionmaking;
import java.util.Scanner;
public class question2 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character");
char ch=sc.next().charAt(0);
if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
{
	System.out.println("vowel");
}
else if(ch=='B'||ch=='C'||ch=='D'||ch=='F'||ch=='G'||ch=='H'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z'||ch=='b'||ch=='c'||ch=='d'||ch=='h'||ch=='f'||ch=='g'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z')
{
	System.out.println("Cosonant");
}
else
{
	System.out.println("Not a alphabet");
}
}
}