package basicpackage1;


public class class_test {

	public void main (String [] args) {
		   try{    
			      //code that may raise exception    
			      int data=100/0;    
			   }catch(ArithmeticException e){System.out.println(e);}    
			   //rest code of the program     
			   System.out.println("rest of the code...");    
			  } 
			
	
}
