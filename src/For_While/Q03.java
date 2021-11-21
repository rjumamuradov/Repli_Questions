package For_While;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * 		Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazıniz.(mülakat Sorusu)
		 * 
		 *  	Write a code that returns the duplicate chars in a String array.(interview
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

		for (int i = 0; i < 6; i++) {

			if (sayac > 1) {
				sayac = 0;
				break;
			}

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					sayac++;
				}

				if (sayac > 2) {
					break;
				}

				if (sayac > 1) {
					System.out.print(str.charAt(i) + " ");

				}

			}

		}

	}

}
