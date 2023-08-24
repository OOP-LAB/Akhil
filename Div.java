package arithematic;
import java.util.Scanner;
interface operati
{
void calc();
}
public class Div implements operati
{
int a;
int b;
public void calc()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int a=sc.nextInt();
System.out.println("enter second number");
int b=sc.nextInt();
System.out.println("dividing two numbers is"+a/b);
}}
