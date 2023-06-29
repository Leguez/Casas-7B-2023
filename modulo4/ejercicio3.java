import java.util.Scanner;

public class ejercicio3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un mes: ");
        String nombreMes = scanner.nextLine();

        int cantidadDias;

        if (nombreMes.equalsIgnoreCase("enero") || nombreMes.equalsIgnoreCase("marzo") ||
                nombreMes.equalsIgnoreCase("mayo") || nombreMes.equalsIgnoreCase("julio") ||
                nombreMes.equalsIgnoreCase("agosto") || nombreMes.equalsIgnoreCase("octubre") ||
                nombreMes.equalsIgnoreCase("diciembre")) {
            cantidadDias = 31;
        } else if (nombreMes.equalsIgnoreCase("febrero")) {
            cantidadDias = 28;
        } else {
            cantidadDias = 30;
        }

        System.out.println("El mes " + nombreMes + " tiene " + cantidadDias + " días.");

        scanner.close();
    }
}


