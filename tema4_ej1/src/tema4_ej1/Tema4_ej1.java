package tema4_ej1;

import java.util.Scanner;
//Cambios desde Github
public class Tema4_ej1 {
//Cambios para probar GitHub
	static int suma(int a, int b) {
		int z;
		z = a + b;
		return z;
	}

	static int resta(int a, int b) {
		int z;
		z = a - b;
		return z;
	}
	
	static int producto(int a, int b) {
		int z;
		z = a *b;
		return z;
	}
	
	static int division(int a, int b) {
		int z;
		z = a /b;
		return z;
	}
	
	static int resto(int a, int b) {
		int z;
		z = a %b;
		return z;
	}

	public static void main(String[] args) {
		// función. SUMA
		int num1, num2, suma, resta, producto, division, resto;

	//	Tema4_ej1 t = new Tema4_ej1(); quito este objeto porque he hecho los métodos static

		Scanner s = new Scanner(System.in);

		System.out.print("Introduce primer número: ");
		num1 = s.nextInt();
		System.out.print("Introduce segundo número: ");
		num2 = s.nextInt();

	    suma = Tema4_ej1.suma(num1, num2);
	 	resta = Tema4_ej1.resta(num1, num2);
	 	producto = Tema4_ej1.producto(num1, num2);
		division = Tema4_ej1.division(num1, num2);
	    resto = Tema4_ej1.resto(num1, num2);

		System.out.println("La suma es   " + suma);
		System.out.println("La resta es   " + resta);
		System.out.println("El producto es   " + producto);
		System.out.println("La division es   " + division);
		System.out.println("La resto es   " + resto);
	}

}
