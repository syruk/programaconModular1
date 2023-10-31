import java.util.Scanner;

public class ConversorMoneda {
    
    public static void showMenu() {
        System.out.println("Selecciona una opción:");
        System.out.println("1. Convertir de euros a dólares");
        System.out.println("2. Convertir de dólares a euros");
        System.out.print("Opción: ");
    }

    public static double euro2dollar(double euros) {
        return euros * 1.18;
    }

    public static double dollar2euro(double dolares) {
        return dolares / 1.18;
    }

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        showMenu();

        int opcion = scanner.nextInt();
        double cantidad;

        switch (opcion) {
            case 1:
                System.out.print("Ingresa la cantidad en euros: ");
                cantidad = scanner.nextDouble();
                System.out.println(cantidad + " euros son " + euro2dollar(cantidad) + " dólares.");
                break;
            case 2:
                System.out.print("Ingresa la cantidad en dólares: ");
                cantidad = scanner.nextDouble();
                System.out.println(cantidad + " dólares son " + dollar2euro(cantidad) + " euros.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        scanner.close();
    }
}