package vehicleoops;

public class vehicle {
   private int model;
   private int engine;
   private String color;
    public vehicle(int a,int b,String c)
    {
    	model=a;
    	engine=b;
    	color=c;
    }
    void vehicleoutput()
    {
    	System.out.println("Vehicle Model:"+model);
    	System.out.println("Vehicle Engine:"+engine);
    	System.out.println("Vehicle colour:"+color);
    	
    }
}

