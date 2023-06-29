import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para mostrar la tabla de multiplicar:");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        System.out.println("Suma de los valores pares:");
        int sumaPares = 0;
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            if (resultado % 2 == 0) {
                sumaPares += resultado;
            }
        }
        System.out.println("La suma de los valores pares es: " + sumaPares);

        scanner.close();
    }
}

