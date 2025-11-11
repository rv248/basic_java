package basicpackage1;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number=344678123;
		System.out.println("before reverse a nummber: "+number);
		long mul =0;
		while(number>0) {
			long rem=number%10;
			mul=mul*10+rem;
			number=number/10;
		}
		System.out.println("after reverse a nummber: "+mul);
	}

}
