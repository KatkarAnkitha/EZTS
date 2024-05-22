import java.util.*;
class Main
{
public static void main(String[] args)
{
 int i,j,k,l,m=1,n=0,num;
Scanner sc=new Scanner(System.in);
System.out.print("enter number of rows:");
num=sc.nextInt();
for(i=1;i<=num;i++)
{m=i;
for(j=1;j<=(num-i);j++)
{System.out.print("  ");
}
for(k=1;k<=i;k++)
{
System.out.print(m+" ");
m++;
}
n=m-2;
for(l=2;l<=i;l++)
{
System.out.print(n+" ");
n--;

}
System.out.println();
}


}
}