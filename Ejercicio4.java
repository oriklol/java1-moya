package proyecto1;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Ingrese la longitud del arreglo: ");
    int longitud = scanner.nextInt();

    int[] array = new int[longitud];

	
    for (int i = 0; i < longitud; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        array[i] = scanner.nextInt();
    }
	
	for(int numero : array) {
		System.out.println(numero);
	
	}
	
	
	}
}
