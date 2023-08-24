import java.util.Scanner;
class GetInputFromUser{
class GetInputFromUser
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter string:");
String s=in.nextLine();
System.out.println("You entered string "+s);
System.out.println("Enter an integer:");
System.out.println("You entered string\t"+s);
int a=in.nextInt();
System.out.println("You entered integer "+a);
System.out.println("Enter a floating no:");
System.out.println("You entered integer\t"+a);
float b=in.nextFloat();
System.out.println("You entered float "+b);
System.out.println("You entered float\t"+b);
}
}
