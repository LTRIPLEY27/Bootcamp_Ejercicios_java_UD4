package javapackage.Ejercicio1;

public class Ejercicio1App {

	public static void main(String[] args) {
		/*
		 * 1
Declara dos variables num�ricas (con el valor que desees), muestra por consola la suma,
resta, multiplicaci�n, divisi�n y m�dulo (resto de la divisi�n).
		 * */
		
		int a = 9, b = 5, suma = 0, resta = 0, multi = 0, div = 0, res = 0;
		
		suma = a + b;
		resta = a - b;
		multi = a * b;
		div = a / b;
		res = a % b;
		
		System.out.println("La suma es igual a = "+ suma);
		System.out.println("La resta es igual a = " + resta);
		System.out.println("La multiplicacion es igual a = "+ multi);
		System.out.println("La division es igual a = " + div);
		System.out.println("El modulo es igual a = " + res);
	}

}
