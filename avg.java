import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num,n;
float sum=0;
System.out.println("enter number of  numbers you want to enter:");
n=sc.nextInt();
System.out.println("enter numbers:");
for(int i=0;i<n;i++)
{
num=sc.nextInt();
sum+=num;
}
System.out.println("average of given numbers is:"+(sum/n));
}
}