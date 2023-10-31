import java.util.Scanner;

public class Circulo {

    

    public static boolean validRadius(double radio) {
        return radio > 0;
    }

    public static double calculateCirclePerimeter(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calculateCircleArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radio;
        do {
            System.out.print("Ingresa el radio (>0): ");
            radio = scanner.nextDouble();
        } while (!validRadius(radio));

        double perimetro = calculateCirclePerimeter(radio);
        double area = calculateCircleArea(radio);

        System.out.println("Perímetro del círculo: " + perimetro);
        System.out.println("Área del círculo: " + area);
        scanner.close();
    }
}