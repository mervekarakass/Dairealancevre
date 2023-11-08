package Daire;

import java.util.Scanner;

public class Dairealancevre {

	public static void main(String[] args) {
		int r;
		double pi = 3.14;
		
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("dairenin yari capini giriniz");
		r = inp.nextInt();
		double alan = pi * r * r;
		double cevre = 2 * pi * r;
		
		System.out.println("dairenin alani : " + alan);
		System.out.println("dairenin cevresi : " + cevre);
		

	}

}
