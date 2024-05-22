import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter tax:");
double tax= sc.nextDouble();
double totaltax=0;
System.out.println("Enter your age:");
int age=sc.nextInt();
if(age<60)
{
if(tax==250000)
{
totaltax=0;
}
else if(tax>250000 && tax<=500000)
{
totaltax=0.05*tax;
}
else if(tax>500000 && tax<=1000000)
{
totaltax=0.1*tax;
}

else if(tax>1000000 && tax<=3000000)
{
totaltax=0.2*tax;
}
else if(tax>3000000)
{
totaltax=0.3*tax;
}
}
else if(age>60)
{
if(tax==300000)
{
totaltax=0;
}
else if(tax>300000 && tax<=500000)
{
totaltax=0.05*tax;
}
else if(tax>500000 && tax<=2000000)
{
totaltax=0.1*tax;
}

else if(tax>2000000)
{
totaltax=0.2*tax;
}

}
System.out.println("Total tax to be paid is:"+totaltax);
}
}
