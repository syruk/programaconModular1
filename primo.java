import java.util.Scanner;

public class primo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero positivo (o 0 para salir): ");
            numero = in.nextInt();

            if (numero > 0) {
                if (esPrimo(numero)) {
                    System.out.println(numero + " es primo.");
                } else {
                    System.out.println(numero + " no es primo.");
                }
            } else if (numero < 0) {
                System.out.println("Por favor, introduce un número entero positivo.");
            } else {
                System.out.println("¡Hasta luego!");
            }
        } while (numero != 0);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        

    }
}