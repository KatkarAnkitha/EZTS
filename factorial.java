import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num,fact=1;
num=sc.nextInt();
for (int i=num;i>0;i--)
{
fact=fact*i;
}
System.out.print(fact);
}
}