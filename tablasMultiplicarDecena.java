import java.util.Scanner;

public class tablasMultiplicarDecena {

    public static void mostrarTablaMultiplicar(int numero) {
        System.out.println("Tabla del " + numero + " del 1 al 10.");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 1;

        while (numero < 11) {
            mostrarTablaMultiplicar(numero);
            numero++;
        }
        scanner.close();
    }
}