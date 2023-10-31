import java.util.Scanner;

public class Triangulo {

  public static void main(String[] args) {
    printTriangle();
  }

  public static void printTriangle() {
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa el carácter para dibujar tu triángulo: ");
    String character = in.next();
    System.out.println("Ingresa la altura de tu triángulo: ");
    int lines = in.nextInt();
    int spaces = lines;
    for (int i = 1; i <= (2 * lines); i += 2) {
      System.out.println(" ".repeat(spaces) + character.repeat(i));
      spaces--;
    }
  }
}
