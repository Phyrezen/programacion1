package programacion1Actividad2;
import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menor, mayor;

        System.out.println("Ingresa el número menor del rango:");
        menor = scanner.nextInt();

        System.out.println("Ingresa el número mayor del rango:");
        mayor = scanner.nextInt();

        System.out.println("Números primos en el rango de " + menor + " a " + mayor + ":");
        for (int i = menor; i <= mayor; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
