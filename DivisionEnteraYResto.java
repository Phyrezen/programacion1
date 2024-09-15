package programacion1Actividad2;
import java.util.Scanner;

public class DivisionEnteraYResto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividendo, divisor;

        System.out.println("Ingresa el primer número (dividendo):");
        dividendo = scanner.nextInt();

        System.out.println("Ingresa el segundo número (divisor):");
        divisor = scanner.nextInt();

        if (divisor != 0) {
            int cociente = dividendo / divisor;
            int resto = dividendo % divisor;
            System.out.println("Resultado de la división entera: " + cociente);
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }

        scanner.close();
    }
}
