package basicpackage1;

public class reverse_string {

	public static void main(String [] args) {
		String name ="venu_raja_varapu";
		String name_rev="";
		
		//size
		int size = name.length();
		System.out.println("size of string is "+name+" = "+size);
		
		//reverse the string
		for(int i=size-1;i>=0;i--) {
			name_rev= name_rev+name.charAt(i);
		}
		System.out.println(name_rev);
		
	}
}