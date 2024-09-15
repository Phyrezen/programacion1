package programacion1Actividad2;

import java.util.Scanner;

public class ValidarContrasena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasena;

        while (true) {
            System.out.println("Por favor, ingresa una contraseña:");
            contrasena = scanner.nextLine();

            if (contrasena.length() >= 6 && contieneNumero(contrasena) && contieneMayuscula(contrasena)) {
                break;
            } else {
                System.out.println("La contraseña debe tener al menos 6 caracteres, un número y una letra mayúscula.");
            }
        }

        System.out.println("Contraseña aceptada.");
        scanner.close();
    }

    //un método con for para recorrer la contraseña buscando un número
    public static boolean contieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    //un método con for para recorrer la contraseña buscando Mayúscula
    public static boolean contieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
