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
for(j=1;j<=(num-i);j++)
{
System.out.print("  ");
}
for(k=1;k<=i;k++)
{
System.out.print("* ");
}
System.out.println();
}
}
}