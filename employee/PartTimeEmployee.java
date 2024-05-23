package employee;

public class PartTimeEmployee  extends Employee{

	private double hourlyrate;
	private int hours;
	public void setHourlyRate(double hr,int h)
	{ 
	   hourlyrate=hr;
	   hours=h;
	}
	public double getSalary()
	{  
		return  hourlyrate*hours ;
	}
}

