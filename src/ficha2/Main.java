package ficha2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("Introduza um número inteiro:"); int number =
		 * input.nextInt();
		 * 
		 * System.out.println("O fatorial de " + number + " é: " + factor(number));
		 * 
		 * System.out.println("Com recursão dá: " + factorRecursivo(number));
		 * 
		 * System.out.println("Introduza uma String para contar o número de vogais: ");
		 * 
		 * input.nextLine();
		 * 
		 * String stringTeste = input.nextLine();
		 * 
		 * System.out.println("A string tem " + numTotalVogais(stringTeste) +
		 * " vogais.");
		 * 
		 * numVogais(stringTeste);
		 */
		System.out.println("Introduza o número de segundos que pretende converter:");

		double segundos = input.nextDouble();

		convertSeconds(segundos);

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

// 
	public static void convertSeconds(double aSeconds) {

		// falta fazer para os meses

		double days = aSeconds / (24 * 3600);

		aSeconds = aSeconds % (24 * 3600);

		double hours = aSeconds / 3600;

		aSeconds = aSeconds % 3600;

		double minutes = aSeconds / 60;

		aSeconds = aSeconds % 60;

		double seconds = aSeconds;

		System.out.println("Dias: " + (int) days + "\n" + "Horas: " + (int) hours + "\n" + "Minutos: " + (int) minutes
				+ "\n" + "Segundos: " + (int) seconds + "\n");

	}
}
