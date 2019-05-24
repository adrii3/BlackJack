package com.company;

import java.util.Scanner;

public class Jugador {
    Scanner sc = new Scanner(System.in);

    int contador;
    int diferencia;


    int decision;


    void decidirSeguirJugando(){
        decision = sc.nextInt();
    }
}
