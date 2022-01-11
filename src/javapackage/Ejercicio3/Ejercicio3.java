package javapackage.Ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*3
Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int ,
dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por
pantalla
•
El valor de cada variable
•
La suma X + Y
•
La diferencia X Y
•
El producto X * Y
•
El cociente X / Y
•
El resto X % Y
•

La suma N + M
•
La diferencia N M
•
El producto N * M
•
El cociente N / M
•
El resto N % M
•

La suma X + N
•
El cociente Y / M
•
El resto Y % M
•
El doble de cada variable
•
La suma de todas las variables
•
El producto de todas las variables
EJERCICIOS*/
		
		int X = 8, Y = 4;
		
		double N = 5, M = 6;
		
		System.out.println("El valor de la variable X : " + X + "\nEl valor de la variable Y : " + Y + "\nEl valor de la variable N : " + N + "\nEl valor de la variable M : " + M);
		
		System.out.println("La suma X + Y =  " + (X + Y));
		
		System.out.println("La diferencia X Y =  " + (X - Y));
		
		System.out.println("El producto X * Y =  " + (X * Y));
		
		System.out.println("El cociente X / Y =  " + (X / Y));
		
		System.out.println("El resto X % Y =  " + (X % Y));
		
		System.out.println("El resto X % Y =  " + (X % Y));
		
		
		System.out.println("La suma N + M = " + (N + M));
		
		System.out.println("La diferencia N M = " + (N - M));
		
		System.out.println("El producto N * M = " + (N * M));
		
		System.out.println("El cociente N / M = " + (N / M));
		
		System.out.println("El resto N % M =" + (N % M));
		
		
		System.out.println("La suma X + N  = " + (X + N));
		
		System.out.println("El cociente Y / M  = " + (Y / M));
		
		System.out.println("El resto Y % M  =  " + (Y % M));
		
		System.out.println("El doble de cada variable:  \n X =  " + (X * X) + "\n Y = " + (Y * Y) + "\n N = " + (N * N) + "\n M = " + (M * M));
		
		System.out.println("La suma de todas las variables: " + (X + Y + N + M));
		
		System.out.println("El producto de todas las variables  " + (X * Y * N * M));
	}

}
