package vehicleoops;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,e;
		String c;
	 boolean flag=true;
		Scanner sc=new Scanner(System.in);
	//BUS	
	  while(flag==true)
	    {
	    	System.out.println("Enter 1 if vehicle is bus \nEnter 2 if vehicle is car \nEnter 3 if vehicle is bike");
	    	System.out.print("Enter ur option:");
	    int a=sc.nextInt();
	    if(a==1)
	    {
		System.out.print("Enter vehicle model:");
		m=sc.nextInt();
		System.out.print("Enter vehicle engine:");
	 e=sc.nextInt();
		System.out.print("Enter vehicle colour:");
		 c=sc.next();
		
		
		System.out.print("Enter Bus SeatingCapacity:");
		int bsc=sc.nextInt();
		Bus bu=new Bus(m,e,c,bsc);
		bu.Busoutput();
	    }
	    
		
	//CAR	
	    else if(a==2)
	    {
		System.out.print("\nEnter vehicle model:");
		 m=sc.nextInt();
		System.out.print("Enter vehicle engine:");
		 e=sc.nextInt();
		System.out.print("Enter vehicle colour:");
		 c=sc.next();
		
		
		System.out.print("Enter Fuel type:");
		String fut=sc.next();
		Car ca=new Car(m,e,c,fut);
		ca.Caroutput();}
	//BIKE
	    else if(a==3)
	    {
		System.out.print("\nEnter vehicle model:");
		m=sc.nextInt();
		System.out.print("Enter vehicle engine:");
		 e=sc.nextInt();
		System.out.print("Enter vehicle colour:");
		 c=sc.next();
		
		
		System.out.print("Enter Bike Type:");
		String bt=sc.next();
		Bike bi=new Bike(m,e,c,bt);
		bi.Bikeoutput();
	    }
	    System.out.print("\nIf you want to continue enter 1 for yes  or else 0 for no:");
	    int con=sc.nextInt();
	    if(con==0)
	    {
	    	flag=false;
	    	
	    }
	 }
	}

}