
import java.util.Scanner;
public class Menu {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        InnerMenu();
        String option = in.next();
        switch (option) {
            case "a": 
                SignoNumero.main(args);
                break;
            case "b":
                MayorEdad.main(args);
                break;
            case "c":
                Circulo.main(args);
                break;
            case "d":
                ConversorMoneda.main(args);
                break;
            case "e":
                TablaDeMultiplicar.main(args);
                break;
            case "f":
                tablasMultiplicarDecena.main(args);
                break;
            case "g":
                primo.main(args);
                break;
            case "h":
                Fecha.main(args);
                break;
            case "i":
                Triangulo.main(args);
                break;
            default:
            System.out.println("ERROR: Elige una opción válida.");
                break;
        }
    }
    
    


    public static void InnerMenu() {
        System.out.println("Escribe el carácter para acceder al ejercicio:");
        System.out.println("a) Muestra el signo de un número introducido por el usuario.\n" + //
                "b) Indica si el usuario es mayor de edad o no.\n" + //
                "c) Calcula el área y perímetro de un círculo.\n" + //
                "d) Conversor de euros a dólares y de dólares a euros.\n" + //
                "e) Mostrar tabla de multiplicar de un número.\n" + //
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" + //
                "g) Comprobador de números primos.\n" + //
                "h) Comprobador de fechas.\n" + //
                "i) Dibujar triángulos.");
    }
        
}