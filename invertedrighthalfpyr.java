import java.util.*;
class Main
{
public static void main(String[] args)
{
  int i,j,k,num;
Scanner sc=new Scanner(System.in);
System.out.print("enter number of rows:");
num=sc.nextInt();
for(i=1;i<=num;i++)
{
for(j=num;j>=i;j--)
{
System.out.print("* ");
}

System.out.println();
}
}
}