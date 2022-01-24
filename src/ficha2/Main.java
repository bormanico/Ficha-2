package ficha2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Introduza um n�mero inteiro:");
		int number = input.nextInt();

		System.out.println("O fatorial de " + number + " �: " + factor(number));

		System.out.println("Com recurs�o d�: " + factorRecursivo(number));

		System.out.println("introduza uma String para contar o n�mero de vogais: ");

		input.nextLine();

		String stringTeste = input.nextLine();

		System.out.println("A string tem " + numTotalVogais(stringTeste) + " vogais.");

		numVogais(stringTeste);

		input.close();

	}

	public static double areaTriang(double aHeight, double aBase) {
		return (.5 * aHeight * aBase);
	}

	public static double areaRetang(double aHeight, double aLenght) {
		return (aHeight * aLenght);
	}

	public static double areaCal(double aHeight, double aLenght, int arg1) {
		if (arg1 == 1) {
			return (.5 * aHeight * aLenght);
		} else {
			return (aHeight * aLenght);
		}
	}

	public static double factor(int n) {
		double factorial = 1;
		if (n == 0) {
			return factorial;
		} else {
			while (n > 1) {
				factorial = factorial * n;
				n--;
			}
		}
		return factorial;
	}

	public static double factorRecursivo(int n) {
		if (n > 1) {
			return n * factorRecursivo(n - 1);
		} else {
			return 1;
		}
	}

	public static int numTotalVogais(String aString) {

		int totalVogais = 0;

		String lowerCaseString = aString.toLowerCase();

		for (int i = 0; i < aString.length(); i++) {

			char currentChar = lowerCaseString.charAt(i);

			if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
					|| currentChar == 'u') {
				totalVogais += 1;
			}

		}

		return totalVogais;
	}

	public static int compareChar(String aString, char aChar) {
		int sumChar = 0;

		String lowerCaseString = aString.toLowerCase();

		for (int i = 0; i < aString.length(); i++) {

			char currentChar = lowerCaseString.charAt(i);

			if (currentChar == aChar) {
				sumChar += 1;
			}

		}

		return sumChar;
	}

	public static void numVogais(String aString) {

		System.out.println("a :" + compareChar(aString, 'a'));
		System.out.println("e :" + compareChar(aString, 'e'));
		System.out.println("i :" + compareChar(aString, 'i'));
		System.out.println("o :" + compareChar(aString, 'o'));
		System.out.println("u :" + compareChar(aString, 'u'));

	}
}
