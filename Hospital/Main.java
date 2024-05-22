package Hospital;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String n,ag,g;
    boolean  flag=true;
    
    while(flag==true)
    {
    	System.out.println("Enter 1 if ur Doctor\nEnter 2 if ur nurse\nEnter 3 if ur patient");
    	System.out.print("Enter ur option:");
    int a=sc.nextInt();
    if(a==1)
    {
    System.out.print("Enter your name  :");
     n=sc.next();
    System.out.print("Enter your age :");
    ag=sc.next();
    System.out.print("Enter your gender :");
     g=sc.next();
    
    System.out.print("Enter Speciality of Doctor:");
    String s=sc.next();
    Doctor d=new Doctor(n,ag,g,s);
    d.docoutput();
    }
    else if(a==2)
    {
    System.out.print("\nEnter your name  :");
   n=sc.next();
    System.out.print("Enter your age:");
     ag=sc.next();
    System.out.print("Enter your gender :");
     g=sc.next();
    
    System.out.print("Enter Floor :");
    int flo=sc.nextInt();
    System.out.print("Enter roomno:");
    int rno=sc.nextInt();
    Nurse nu=new Nurse(n,ag,g,rno,flo);
    nu.nurseoutput();
    }
    else if(a==3)
    {
    System.out.print("\nEnter your name  :");
   n=sc.next();
    System.out.print("Enter your age:");
    ag=sc.next();
    System.out.print("Enter your gender:");
   g=sc.next();
    
    System.out.print("Enter Bedno of Patient :");
    int bn=sc.nextInt();
    System.out.print("Enter disease of Patient:");
    String dis=sc.next();
    Patient pa=new Patient(n,ag,g,dis,bn);
    pa.patientoutput();
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
