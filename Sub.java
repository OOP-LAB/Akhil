package arithematic;
import java.util.Scanner;
interface opera
{
void calc();
}
public class Sub implements opera
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
System.out.println("subtracting  two numbers is"+(a-b));
}}
