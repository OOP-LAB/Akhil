import java.util.Scanner; 
class Symmetric{
public static void main(String[] args)
{
   int row,col,i,j,flag=1;
   Scanner in=new Scanner(System.in);
   System.out.println("enter the number of rows:");
   row=in.nextInt();
   System.out.println("enter the number of cols:");
   col=in.nextInt();
   int MAT1[][]=new int[row][col];
   System.out.println("enter the values");
   for(i=0;i<row;i++)
   for(j=0;j<col;j++)
   MAT1[i][j]=in.nextInt();  
   for(i=0;i<row;i++)
   for(j=0;j<col;j++)
   if(MAT1[i][j] != MAT1[j][i])
   {
   flag=0;
   }
   if(flag==1)
   System.out.println("symmetric matrix");
   else
   System.out.println("asymmetric matrix");
   }
   }
