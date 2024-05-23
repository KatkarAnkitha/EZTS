package javabasics;
import java.util.*;
public class firstnonrepeatingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a string");
      String s=sc.next();
      int n=s.length();
      int arr[]=new int[n];
      int i,j,c;
      
      for(i=0;i<n;i++)
      {c=-1;
    	  for(j=0;j<n;j++)
    	  {
    		  if(s.charAt(i)==s.charAt(j))
    		  {
    			  c=c+1;
    		  }
    	  }
    	  arr[i]=c;
      }
      
      for(i=0;i<n;i++)
      {
    	  if(arr[i]==0)
    	  {
    		  System.out.print("The first Non-repeating character is:"+s.charAt(i));
    		  break;
    	  }
      }
      if(i+1==n+1)
      {
    	  System.out.print("All characters are repeating");
      }
      
      
	}

}
