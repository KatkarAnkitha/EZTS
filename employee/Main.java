package employee;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String name ;
    double sal,hrlyrate;
    int age,hrs;
    
    FullTimeEmployee ft=new  FullTimeEmployee();
    System.out.print("\nEnter name :");
    name=sc.next();
    System.out.print("Enter age:");
    age=sc.nextInt();
    System.out.print("Enter salary:");
    sal=sc.nextDouble();
    
    ft.setDetails(name,age);
    System.out.println(ft.getDetails());
    ft.setSalary(sal);
    System.out.println("Salary of employee is:"+ft.getSalary());
    
    
    
    PartTimeEmployee pt=new  PartTimeEmployee();
    System.out.print("\nEnter name :");
    name=sc.next();
    System.out.print("Enter age:");
    age=sc.nextInt();
    System.out.print("Enter Hourlyrate:");
    hrlyrate=sc.nextDouble();
    System.out.print("Enter hours:");
    hrs=sc.nextInt();
    
    pt.setDetails(name,age);
    System.out.println(pt.getDetails());
    pt.setHourlyRate(hrlyrate,hrs);
    System.out.println("Salary of employee is:"+pt.getSalary());
    
    
    
    
    
	}

}
