import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jugador 1, ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int eleccionJugador1 = scanner.nextInt();
        
        System.out.println("Jugador 2, ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int eleccionJugador2 = scanner.nextInt();
        
        String ganador;
        
        if ((eleccionJugador1 == 0 && eleccionJugador2 == 2) ||
            (eleccionJugador1 == 1 && eleccionJugador2 == 0) ||
            (eleccionJugador1 == 2 && eleccionJugador2 == 1)) {
            ganador = "Jugador 1";
        } else if ((eleccionJugador2 == 0 && eleccionJugador1 == 2) ||
                   (eleccionJugador2 == 1 && eleccionJugador1 == 0) ||
                   (eleccionJugador2 == 2 && eleccionJugador1 == 1)) {
            ganador = "Jugador 2";
        } else {
            ganador = "Empate";
        }
        
        System.out.println("El ganador es: " + ganador);
        
        scanner.close();
    }
}

