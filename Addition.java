import java.util.Scanner; 
class Addition{
public static void main(String[] args)
{
   int row,col,i,j;
   Scanner in=new Scanner(System.in);
   System.out.println("enter the number of rows:");
   row=in.nextInt();
   System.out.println("enter the number of cols:");
   col=in.nextInt();
   int MAT1[][]=new int[row][col];
   int MAT2[][]=new int[row][col];
   int MAT3[][]=new int[row][col];
   System.out.println("enter the values");
   for(i=0;i<row;i++)
   for(j=0;j<col;j++)
   MAT1[i][j]=in.nextInt();    
   System.out.println("enter the values");
   for(i=0;i<row;i++)
   for(j=0;j<col;j++)
   MAT2[i][j]=in.nextInt();    
   for(i=0;i<row;i++)
   for(j=0;j<col;j++)
   MAT3[i][j]=MAT1[i][j]+MAT2[i][j];
   for(i=0;i<row;i++)
   {
   System.out.println("\n");  
   for(j=0;j<col;j++)
    System.out.print("\t"+MAT3[i][j]);
   }
}
}
  
