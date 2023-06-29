import java.util.Random;

public class ejercicio19 {
    public static void main(String[] args) {
        Random random = new Random();

        int contador = 0;
        int suma = 0;

        while (contador < 10) {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Número generado: " + numero);

            suma += numero;
            contador++;
        }

        double promedio = suma / 10.0; // Calcula el promedio como un número decimal

        System.out.println("Suma de los números: " + suma);
        System.out.println("Promedio de los números: " + promedio);
    }
}

