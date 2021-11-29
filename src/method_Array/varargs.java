package method_Array;

import java.util.Scanner;

public class varargs {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts more than one integer as parameter and
		 * prints the sum of integers 
		 * Method name = sum 
		 * if you call method like that
		 * sum(1,2,3) output =6
		 *  sum(1,2,3,4,5) output =15 
		 *  sum(1,2) output=3
		 */
		
		//Scanner scan = new Scanner (System.in);
		 //sum();
		System.out.println("Girilen sayilarin toplami : "+sum());
		
		
		

	}

	public static int sum() {
		Scanner scan = new Scanner (System.in);
		System.out.println("kac sayi toplamak istiyorsunuz");
		int toplam=0;
		int sayi=scan.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			System.out.println("please "+i+ ". number");
			int sayi1=scan.nextInt();
			toplam+=sayi1;
			
			
		}
		
		
		
	return toplam;}

}
