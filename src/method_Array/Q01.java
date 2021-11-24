package method_Array;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Write a return method to reverse number.
		 * 
		 * Input : 12345
		 * 
		 * Output : 54321
		 */
		
		String num="12345";
		
		//String ters="";
		
		
		
		System.out.println(tersineYaz(num));

	}

	public static String tersineYaz( String num) {
		String ters="";
		for (int i = num.length()-1 ; i >= 0; i--) {
			ters+=num.substring(i, i+1);			
		}
		
	return ters ;}

}
