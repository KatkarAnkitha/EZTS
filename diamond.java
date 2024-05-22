import java.util.*;
class Main
{
public static void main(String[] args)
{
  int i,j,k,num;
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");
num=sc.nextInt();
for(i=1;i<=num;i++)
{
for(j=num;j>i;j--)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}


for(i=2;i<=num;i++)
{
for(j=1;j<i;j++)
{
System.out.print(" ");
}
for(j=num;j>=i;j--)
{
System.out.print("* ");
}
System.out.println();
}
}
}