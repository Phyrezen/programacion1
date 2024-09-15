package programacion1Actividad2;

import java.util.Scanner;

public class ValorCorrecto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Por favor, ingresa un número positivo:");
            numero = scanner.nextInt();
        } while (numero <= 0);

        System.out.println("Has ingresado un número válido: " + numero);
        scanner.close();
    }
}
