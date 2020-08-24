package code.academy.draft;

import java.util.Scanner;

public class Uzduotis1 {

	public static void main(String[] args) {
		String sakinys = ivesti();
		int indeksas1 = 0;
		int indeksas2 = sakinys.length(); // pakeisti

		String z1 = sakinys.substring(indeksas1, indeksas2);

		System.out.println("Pirmas sakinio žodis: " + z1 + ".");

	}

	private static String ivesti() {
		System.out.println("ENTER ANY WORD");
		Scanner scanner = new Scanner(System.in);

		return scanner.next();
	}



}