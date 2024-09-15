package programacion1Actividad2;

import java.util.Scanner;

public class TiendaEnLinea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double montoCompra;
        double descuento = 0;

        System.out.println("Bienvenido a la tienda en línea");
        System.out.println("Por favor, ingresa el monto total de tu compra:");
        montoCompra = scanner.nextDouble();

        if (montoCompra >= 100 && montoCompra < 200) {
            descuento = 0.10; // 10% de descuento
        } else if (montoCompra >= 200) {
            descuento = 0.20; // 20% de descuento
        }

        if (descuento > 0) {
            double montoDescuento = montoCompra * descuento;
            double totalConDescuento = montoCompra - montoDescuento;
            System.out.println("Has recibido un descuento del " + (int)(descuento * 100) + "%.");
            System.out.println("Monto a pagar después del descuento: $" + totalConDescuento);
        } else {
            System.out.println("No eres elegible para un descuento.");
            System.out.println("Monto a pagar: $" + montoCompra);
        }

        scanner.close();
    }
}
