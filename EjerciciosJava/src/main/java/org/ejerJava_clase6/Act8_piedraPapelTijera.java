package org.ejerJava_clase6;

import javax.swing.*;

/*
    Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras"
    contra la computadora. El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras)
    y luego generar una elección aleatoria para la computadora. Después de eso, el programa debe determinar el ganador
    según las reglas del juego y mostrar el resultado.
 */
public class Act8_piedraPapelTijera {
    public static void main(String[] args) {

        String rtaUser = null;
        do {

            String[] rtaIA = {"piedra", "papel", "tijera"};
            String nombreUser = null;
            int puntosIA = 0;
            int puntosUser = 0;

            JOptionPane.showInternalMessageDialog(null, "!BIENVENIDO A PIEDRA, PAPEL, O TIJERA!");
            nombreUser = JOptionPane.showInputDialog("Ingresa tu nombre");

            do {
                rtaUser = JOptionPane.showInputDialog("Adivina: ¿PIEDRA, PAPEL, O TIJERA?");

                // El casteo redondea el decimal hacia abajo, restandole -1.
                int rtaIACod = (int) (Math.random() * 3);
                String rtaIASeleccionada = rtaIA[rtaIACod];


                // Resultado
                JOptionPane.showInternalMessageDialog(null, nombreUser + ": " + rtaUser + " | Maquina: " + rtaIASeleccionada);

                // Verifica las elecciones y otorga el punto al ganador correspondiente.
                if (rtaIASeleccionada.equalsIgnoreCase("piedra") && rtaUser.equalsIgnoreCase("tijera")) {
                    puntosIA++;
                } else if (rtaIASeleccionada.equalsIgnoreCase("piedra") && rtaUser.equalsIgnoreCase("papel")) {
                    puntosUser++;
                } else if (rtaIASeleccionada.equalsIgnoreCase("papel") && rtaUser.equalsIgnoreCase("piedra")) {
                    puntosIA++;
                } else if (rtaIASeleccionada.equalsIgnoreCase("papel") && rtaUser.equalsIgnoreCase("tijera")) {
                    puntosUser++;
                } else if (rtaIASeleccionada.equalsIgnoreCase("tijera") && rtaUser.equalsIgnoreCase("piedra")) {
                    puntosUser++;
                } else if (rtaIASeleccionada.equalsIgnoreCase("tijera") && rtaUser.equalsIgnoreCase("papel")) {
                    puntosIA++;
                } else if (!rtaUser.equalsIgnoreCase("papel") || !rtaUser.equalsIgnoreCase("piedra")
                        || !rtaUser.equalsIgnoreCase("tijera")) {
                    JOptionPane.showInternalMessageDialog(null, "Respuesta incorrecta, vuelve a intentar");
                } else {
                    JOptionPane.showInternalMessageDialog(null, "EMPATE!");
                }

                // Muestra el resultado
                JOptionPane.showInternalMessageDialog(null, nombreUser + ": " + puntosUser + " | Maquina: " + puntosIA);
            } while (puntosIA != 3 && puntosUser != 3 && !rtaUser.equalsIgnoreCase(null));
            if (puntosUser > puntosIA) {
                JOptionPane.showInternalMessageDialog(null, "!FELICITACIONES¡, !GANASTE¡");
            } else if (rtaUser.equalsIgnoreCase(null)) {
                JOptionPane.showInternalMessageDialog(null, "Perdiste, abandonaste.");
            } else {
                JOptionPane.showInternalMessageDialog(null, "Perdiste, La maquina te venció.");
            }

            JOptionPane.showInternalMessageDialog(null, nombreUser + ": " + puntosUser + " | Maquina: " + puntosIA);

            rtaUser = JOptionPane.showInputDialog("¿Quieres volver a jugar?");

        } while (!rtaUser.equalsIgnoreCase("no"));
        JOptionPane.showInternalMessageDialog(null, "JUEGO FINALIZADO.");

    }
}
