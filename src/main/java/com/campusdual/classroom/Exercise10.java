package com.campusdual.classroom;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {

        // Inicializamos
        String color1 = "";
        String color2 = "";

        // Hacemos el bucle
        while (!Objects.equals(color1, "azul") || !Objects.equals(color2, "azul")){
            color1 = getBall();
            color2 = getBall();
        }
        System.out.println("Fin del proceso. Pelotas: " + color1 + "," + color2);
    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        String randomColor = "";

        switch (randomWithRange(1,3)){
            case 1:
                randomColor = "rojo";
                break;
            case 2:
                randomColor = "azul";
                break;
            case 3:
                randomColor = "verde";
                break;
            default:
                break;
        }
        return randomColor;
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}