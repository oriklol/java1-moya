package proyecto1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char opcion;
		boolean repetir =false;
		
		
		do {
			System.out.println("Menu\n");
			System.out.println("1. Suma\n");
			System.out.println("2. Resta\n");
			System.out.println("3. Multiplicacion\n");
			System.out.println("4. Division\n");
			System.out.println("5. Salir\n");
			System.out.println("\nIngrese su opcion: \n");
			opcion = scanner.next().charAt(0);
			
			switch(opcion) {
			case '1':
				System.out.print("Ingrese el primer numero: ");
        			double num1 = scan.nextDouble();
        			System.out.print("Ingrese el segundo numero: ");
        			double num2 = scan.nextDouble();
        			double resultado = 0;
        			resultado = num1 + num2;
				System.out.println("Resultado: " + resultado);
				num1= 0;
				num2= 0;
				repetir = true;
				break;
			case '2':
				System.out.print("Ingrese el primer numero: ");
        			double num1 = scan.nextDouble();
        			System.out.print("Ingrese el segundo numero: ");
        			double num2 = scan.nextDouble();
        			double resultado = 0;
        			resultado = num1 - num2;
				System.out.println("Resultado: " + resultado);
				num1= 0;
				num2= 0;
				repetir = true;
				break;
			case '3':
				System.out.print("Ingrese el primer numero: ");
        			double num1 = scan.nextDouble();
        			System.out.print("Ingrese el segundo numero: ");
        			double num2 = scan.nextDouble();
        			double resultado = 0;
        			resultado = num1 * num2;
				System.out.println("Resultado: " + resultado);
				num1= 0;
				num2= 0;
				repetir = true;
				break;
			case '4':
				System.out.print("Ingrese el primer numero: ");
        			double num1 = scan.nextDouble();
        			System.out.print("Ingrese el segundo numero: ");
        			double num2 = scan.nextDouble();
        			double resultado = 0;
        			resultado = num1 / num2;
				System.out.println("Resultado: " + resultado);
				num1= 0;
				num2= 0;
				repetir = true;
				break;
			case '5':
				System.out.println("\nSaliendo del programa....\n");
				break;
			default:
				System.out.println("\nIngrese una opcion valida\n");
				repetir = true;
			}
		}while(repetir == true);
		
		
		
		
		
		
		
		
	}

}
