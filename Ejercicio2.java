package proyecto1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=50;i<=100; i++) {
			boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i + " - primo");
            } else {
                System.out.print(i + " - divisores: ");
                for (int k = 1; k <= i; k++) {
                    if (i % k == 0) {
                        System.out.print(k + " ");
                    }
                }
                System.out.println();
            }
            
		}
		
		
		
	}

}
