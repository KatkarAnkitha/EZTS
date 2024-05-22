import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a,b;
ch op;
System.out.println("enter first number:");
a=sc.nextInt();
System.out.println("enter second number:");
b=sc.nextInt();
System.out.println("enter operator:");
ch=sc.next();
switch(ch)
{
 case '+':
         {System.out.println("Addition of two numbers is :");
         System.out.print(a+b);}
 case '-':
       if(a>b)
{  
System.out.println("Subtraction of two numbers is :");
         System.out.print(a-b);
}
else
{
System.out.println("Subtraction of two numbers is :");
         System.out.print(b-a);
}
}
 case '*':
   { System.out.println("Multiplication of two numbers is :");
         System.out.print(a*b);
}
case '/':
{System.out.println("divison of two numbers is :");
         System.out.print(a/b);}
case '%':
{System.out.println("percentile of two numbers is :");
         System.out.print(a%b);}

}
}
}