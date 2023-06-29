import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría del empleado (A, B, C): ");
        char categoria = scanner.next().charAt(0);

        System.out.print("Ingrese la antigüedad del empleado (en años): ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = scanner.nextDouble();

        double sueldoNeto = sueldoBruto;

        if (antiguedad >= 1 && antiguedad <= 5) {
            sueldoNeto += sueldoBruto * 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            sueldoNeto += sueldoBruto * 0.1;
        } else if (antiguedad > 10) {
            sueldoNeto += sueldoBruto * 0.3;
        }

        switch (categoria) {
            case 'A':
                sueldoNeto += 1000;
                break;
            case 'B':
                sueldoNeto += 2000;
                break;
            case 'C':
                sueldoNeto += 3000;
                break;
        }

        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);
    }
}


