package programacion1Actividad2;
import java.util.Scanner;
import java.util.Random;

public class ElNumeroReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        boolean acertado = false;

        System.out.println("¡Bienvenido al juego de adivinanza ElGenio!");
        System.out.println("He elegido un número entre 1 y 100. ¿Puedes adivinar cuál es?");

        while (!acertado) {
            System.out.println("Ingresa tu intento:");
            intento = scanner.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número correcto.");
                acertado = true;
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número es menor. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
