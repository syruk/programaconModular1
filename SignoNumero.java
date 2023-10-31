import java.util.Scanner;

public class SignoNumero {

    public static int numberSign(double numero) {
        if (numero == 0) {
            return 0;
        } else if (numero > 0) {
            return 1;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        int signo = numberSign(numero);

        if (signo == 0) {
            System.out.println("El número es 0.");
        } else if (signo == 1) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }
        scanner.close();
    }
}