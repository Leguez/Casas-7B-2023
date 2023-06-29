import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para mostrar la tabla de multiplicar:");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del número " + numero + ":");

        int sumaPares = 0;

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

            if (resultado % 2 == 0) {
                sumaPares += resultado;
            }
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);

        scanner.close();
    }
}

