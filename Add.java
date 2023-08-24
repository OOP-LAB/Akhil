package arithematic;
import java.util.Scanner;
interface oper
{
void calc();
}
public class Add implements oper
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
System.out.println("addition of two number is"+(a+b));
}}
