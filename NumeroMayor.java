package programacion1Actividad2;
import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

	  Scanner scanner = new Scanner(System.in);
	  
      System.out.println("Por favor, ingresa el primer número:");
      int numero1 = scanner.nextInt();

      System.out.println("Por favor, ingresa el segundo número:");
      int numero2 = scanner.nextInt();

      if (numero1 > numero2) {
          System.out.println("El número " + numero1 + " es mayor que " + numero2 + ".");
      } else if (numero1 < numero2) {
          System.out.println("El número " + numero2 + " es mayor que " + numero1 + ".");
      } else {
          System.out.println("Ambos números son iguales.");
      }

      scanner.close();
  }
}
