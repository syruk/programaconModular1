import java.util.Scanner;

public class Fecha {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Ingrese el día (1-31): ");
    int day = in.nextInt();

    System.out.print("Ingrese el mes (1-12): ");
    int month = in.nextInt();

    System.out.print("Ingrese el año: ");
    int year = in.nextInt();

    if (dateIsValid(day, month, year)) {
      System.out.println("La fecha es válida.");
    } else {
      System.out.println("La fecha no es válida.");
    }
  }

  public static boolean dateIsValid(int dia, int mes, int año) {
        if (año >= 1 && mes >= 1 && mes <= 12) {
            int maxDias = 31;
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
            } else if (mes == 2) {
                maxDias = (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) ? 29 : 28;
            }

            return dia >= 1 && dia <= maxDias;
        }
        return false;
    }}

  
