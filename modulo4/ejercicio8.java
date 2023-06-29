import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jugador 1, ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int eleccionJugador1 = scanner.nextInt();
        
        System.out.println("Jugador 2, ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int eleccionJugador2 = scanner.nextInt();
        
        String ganador;
        
        if (eleccionJugador1 == eleccionJugador2) {
            ganador = "Empate";
        } else if (eleccionJugador1 == 0) { // Jugador 1 elige piedra
            if (eleccionJugador2 == 1) {
                ganador = "Jugador 2";
            } else {
                ganador = "Jugador 1";
            }
        } else if (eleccionJugador1 == 1) { // Jugador 1 elige papel
            if (eleccionJugador2 == 0) {
                ganador = "Jugador 1";
            } else {
                ganador = "Jugador 2";
            }
        } else { // Jugador 1 elige tijera
            if (eleccionJugador2 == 0) {
                ganador = "Jugador 2";
            } else {
                ganador = "Jugador 1";
            }
        }
        
        System.out.println("El ganador es: " + ganador);
        
        scanner.close();
    }
}

