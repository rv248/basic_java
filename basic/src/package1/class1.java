package package1;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("code flow 1");
		  try{       
		      int data=100/0;    
		   }
		  catch(java.lang.ArithmeticException e){
			   System.out.println(e);
			   }    
	   
		   System.out.println("code flow 2");    
		  } 

	}

