public class ejercicio22 {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            // Generar categoría al azar
            char categoria = generarCategoriaAleatoria();

            // Generar antigüedad al azar entre 1 y 15 años
            int antiguedad = generarAntiguedadAleatoria();

            // Generar sueldo al azar entre 1000 y 5000
            double sueldo = generarSueldoAleatorio();

            double sueldoNeto = sueldo;

            // Aumento del sueldo según la antigüedad
            if (antiguedad >= 1 && antiguedad <= 5) {
                sueldoNeto += sueldo * 0.05;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                sueldoNeto += sueldo * 0.1;
            } else if (antiguedad > 10) {
                sueldoNeto += sueldo * 0.3;
            }

            // Plus según la categoría
            int plus = 0;
            switch (categoria) {
                case 'A':
                    plus = 1000;
                    break;
                case 'B':
                    plus = 2000;
                    break;
                case 'C':
                    plus = 3000;
                    break;
            }
            sueldoNeto += plus;

            // Verificar si el sueldo neto está dentro del rango correcto
            if (sueldoNeto >= 1000 && sueldoNeto <= 10000) {
                System.out.println("Empleado " + (contador + 1) + ":");
                System.out.println("Categoría: " + categoria);
                System.out.println("Antigüedad: " + antiguedad + " años");
                System.out.println("Sueldo bruto: " + sueldo);
                System.out.println("Sueldo neto: " + sueldoNeto);
                System.out.println();

                contador++;
            }
        }
    }

    private static char generarCategoriaAleatoria() {
        int randomIndex = (int) (Math.random() * 3);
        return (char) ('A' + randomIndex);
    }

    private static int generarAntiguedadAleatoria() {
        return (int) (Math.random() * 15) + 1;
    }

    private static double generarSueldoAleatorio() {
        return Math.random() * 4000 + 1000;
    }
}

