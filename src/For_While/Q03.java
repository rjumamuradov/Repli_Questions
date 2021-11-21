package For_While;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazıniz.(mülakat Sorusu)
		 * 
		 * Write a code that returns the duplicate chars in a String array.(interview
		 * Question)
		 * 
		 * Input :
		 * 
		 * String str=“Javaisalsoeasy”
		 * 
		 * Output: a s
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz : ");
		String str = scan.nextLine();

		int sayac = 0;
		char crc='a';

		for (int i = 0; i < str.length() - 1; i++) {
			sayac=0;

			for (int j = 0; j < str.length() - 1; j++) {
				
				if (str.charAt(i) == str.charAt(j)) {
					sayac++;
					
				}
			}
			crc=str.charAt(i);
			
			if (sayac > 2 ) {
				crc=str.charAt(i);
				System.out.print(crc+" ");
				
				
			}

		}

	}

}
