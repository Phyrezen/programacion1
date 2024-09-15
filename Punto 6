package programacion1Actividad2;

import java.util.Scanner;

public class MenuOperaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double numero1, numero2, resultado = 0;

        System.out.println("Menú de Operaciones:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("Elige una opción:");
        opcion = scanner.nextInt();

        System.out.println("Ingresa el primer número:");
        numero1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo número:");
        numero2 = scanner.nextDouble();

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                scanner.close();
                return;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
