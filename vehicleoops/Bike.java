package vehicleoops;

public class Bike extends vehicle {
	private String type;
	public  Bike(int a,int b,String c,String ty)
	{  
		super(a,b,c);
		type=ty;
		
	}
	void  Bikeoutput()
	{
		super.vehicleoutput();
		System.out.print("Type of Bike is:"+type);
	}

}
