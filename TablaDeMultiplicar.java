import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void mostrarTablaMultiplicar(int numero) {
        System.out.println("\nTabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingresa un número del 1 al 10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        mostrarTablaMultiplicar(numero);
        scanner.close();
    }
}