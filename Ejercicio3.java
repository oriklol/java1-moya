

package proyecto1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean esPrimo;
                        
        do {
        	System.out.print("Introduce un numero: ");
        	numero = scanner.nextInt();
        	
    		esPrimo = true;
            for (int j = 2; j < Math.sqrt(numero); j++) {
            	if (numero % j == 0) {
            		esPrimo = false;
                    break;
                }
            }
        
        if(numero<=100 || !esPrimo) {
        	System.out.println("El número no es mayor que 100 o no es primo. Inténtalo de nuevo.");
        }
        }
        
        while(numero<=100 || !esPrimo);
        System.out.println("Has introducido un número mayor que 100 y primo");
	


	
	
	
	}

}
