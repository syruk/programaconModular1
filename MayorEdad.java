import java.util.Scanner;

public class MayorEdad {

   public static boolean isAdult(int edad) {
    return numberSign(edad - 18) >= 0;
  }

  public static int numberSign(int numero) {
    if (numero == 0) {
      return 0;
    } else if (numero > 0) {}
    return numero;
  }
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa tu edad: ");
    int edad = scanner.nextInt();

    if (isAdult(edad)) {
      System.out.println("Eres mayor de edad.");
    } else {
      System.out.println("Eres menor de edad.");
    }
    scanner.close();
  }
}
