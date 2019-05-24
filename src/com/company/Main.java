package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jugador jugador = new Jugador();
        Croupier croupier = new Croupier();

        croupier.preguntarSeguirJugando();
        jugador.decidirSeguirJugando();

        while(jugador.decision==1){
            croupier.sacarCarta();

            croupier.añadirCartaAlJugador(jugador.contador);
            croupier.mostrarPuntosJugador(jugador.contador);

            croupier.preguntarSeguirJugando();
            jugador.decidirSeguirJugando();
        }

        croupier.mostrarTurnoCroupier();

        if(jugador.contador != 0){
            while(croupier.contadormaquina <= 17){

                croupier.sacarCarta();

                croupier.añadirCartaAlCroupier();
            }
        }

        croupier.mostrarPuntosJugador(jugador.contador);
        croupier.mostrarPuntosCroupier();
        int resultado = croupier.calcularResultado(jugador.contador);

        croupier.mostrarResultado(resultado);
    }
}


/*
    Passar datos (enviar) ->>>   se envian   (dato)         se reciben   (int variable)
    Retornar datos        -->>>  se retornan (return tal)   se recogen   int variable =

 */