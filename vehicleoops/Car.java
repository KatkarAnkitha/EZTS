package vehicleoops;

public class Car extends vehicle {
	private String fueltype;
	public Car(int a ,int b,String c,String ft)
	{   super(a,b,c);
		fueltype=ft;
	}
	void  Caroutput()
	{
		super.vehicleoutput();
		System.out.print("Fuel Type of Car is:"+fueltype);
	}


}
