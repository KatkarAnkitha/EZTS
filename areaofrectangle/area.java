package areaofrectangle;

public class area {
   private int length,breadth;
   void setdim(int l,int b)
   {
	   length=l;
	   breadth=b;
   }
   void getarea()
   {
	   System.out.println("Area of rectangle is :"+(length*breadth));
   }
}
