class Sum
{
	  int add(int a ,int b)
	  {
		  return(a+b);
	  }
       int add(int a ,  int b , int c )
	  {
	   return (a + b + c);
	  }
        Double add (double a, double b )
	  {
			return ( a + b);
	  }
}
	  
	  public class Method
	  {
		 public static void main(String args[])
	  {
		  Sum s1 = new Sum();
		  System.out.println(s1.add(2,3));
		  
		  
	      Sum s2 = new Sum();
	      System.out.println(s2.add(1,2,3));
		  
		  
		  Sum s3 = new Sum();
		  System.out.println(s3.add(2.4 , 4.5));
	  }
	  }
		  
		  
		  
		  
		  
		  
			 
		 
		 
		
		  
			  
				  
					  
					  