package desafio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio2 {

	static int n1, n2;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String desicion = "s";
		boolean salir = false;

		while (salir == false) {
		
		System.out.println("ingrese que tipo de ecuacion desee realizar");
		String calculadora = entrada.next().toLowerCase();


			switch (calculadora) {

			case "suma":

				IngresarNumeros();
				suma(n1, n2);

				System.out.println("desea volver al menú? s/n");
				desicion = entrada.next().toLowerCase();

				if (desicion.equals("n")) {
					salir = true;

				}
				break;

			case "resta":

				IngresarNumeros();
				resta(n1, n2);
				
				System.out.println("desea volver al menú? s/n");
				desicion = entrada.next().toLowerCase();

				if (desicion.equals("n")) {
					salir = true;

				}

				break;

			case "multiplicacion":

				IngresarNumeros();
				multiplicacion(n1, n2);
				
				System.out.println("desea volver al menú? s/n");
				desicion = entrada.next().toLowerCase();

				if (desicion.equals("n")) {
					salir = true;

				}

				break;

			case "division":

				try {
					IngresarNumeros();
					if (n2 <= 0) {
						throw new ArithmeticException();
					}
					division(n1, n2);
				} catch (ArithmeticException e) {
					System.out.println("Error: Division por cero o numero negativo.");
				}
				
				System.out.println("desea volver al menú? s/n");
				desicion = entrada.next().toLowerCase();

				if (desicion.equals("n")) {
					salir = true;

				}
				
				break;
			}
		}
		if (salir == true) {
			System.out.println("Abandonaste.");
		}
	}

	public static void IngresarNumeros() {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("ingrese un numero");
			n1 = entrada.nextInt();
			System.out.println("ingrese un segundo numero");
			n2 = entrada.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un dato valido.");
		}
	}

	public static int suma(int a, int b) {

//		IngresarNumeros();

		int resultadoSuma = a + b;

		System.out.println("El reultado es:" + resultadoSuma);

		return resultadoSuma;
	}

	public static int resta(int a, int b) {

		// IngresarNumeros();

		int resultadoResta = a - b;
		System.out.println("El reultado es:" + resultadoResta);

		return resultadoResta;
	}

	public static float division(float a, float b) {

		// IngresarNumeros();

		float resultadoDiv = a / b;

		System.out.println("El reultado es:" + resultadoDiv);

		return resultadoDiv;

	}

	public static int multiplicacion(int a, int b) {

		// IngresarNumeros();

		int resultadoMul = a * b;

		System.out.println("El reultado es:" + resultadoMul);

		return resultadoMul;
	}

}