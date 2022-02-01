package Al_Sagredo.github.com.Calculadora2;

import java.util.Scanner;

public class Calculadora {

	Scanner sc = new Scanner(System.in);
	
	public void calcular() {
		
		
		
		System.out.println("1. Restar\n"
				+ "2. Sumar\n"
				+ "3. Multiplicar\n"
				+ "4. Dividir\n");
		System.out.println("Elige opción");
		String opcion = sc.next();
		System.out.println("Ingresa los números: ");
		double a= sc.nextDouble();
		double b = sc.nextDouble();
		
		switch(opcion) {
		case "1": System.out.println(restar(a, b));
		break;
		case"2": System.out.println(sumar(a, b));
		break;
		case "3":System.out.println (multiplicar(a, b));
		break;
		case "4":System.out.println (dividir(a, b));
		break;
		}
	}
	
	public double sumar(double a, double b) {
		
		return a+b;
	}
	
	public double restar(double a, double b) {
		return a-b;
	}
	
	public double multiplicar(double a, double b) {
		return a*b;
	}
	
	public double dividir(double a, double b) {
		if(b ==0) {
			System.out.println("No se puede dividir por 0");
			return 0;
		}
		return a/b;
	}
	
}
