package com.company;

import java.util.Random;

public class Croupier {

    int numero;
    int contadormaquina;


    void manocroupier(){
        System.out.println("Jugada croupier: "+numero);
    }


    void preguntarSeguirJugando(){
        System.out.println("Juegas? Si=1, No=2");
    }

    int calcularResultado(int contador){
        int diferencia;
        int diferenciamaquina;

        if(contador>21){
            return 1;
        }else if(contadormaquina>21){
            return 2;
        } else {
            diferencia=21-contador;
            diferenciamaquina=21-contadormaquina;

            if(diferenciamaquina==diferencia){
                return 0;
            }else if(diferencia>diferenciamaquina){
                return 1;
            }else{
                return 2;
            }
        }
    }

    void mostrarResultado(int resultado){
        if(resultado == 0){
            System.out.println("EMPATE");
        }else if(resultado == 1){
            System.out.println("HAS PERDIDO");
        }else{
            System.out.println("HAS GANADO");
        }
    }

    void sacarCarta(){
        numero = new Random().nextInt(11)+1;
        System.out.println(numero);
    }

    void añadirCartaAlCroupier(){
        contadormaquina=contadormaquina+numero;
        System.out.println("Contador: "+contadormaquina);
    }

    void añadirCartaAlJugador(int contador){
        contador=contador+numero;
        System.out.println("Contador: "+contador);
    }

    void mostrarPuntosCroupier(){
        System.out.println("Puntos Croupier: "+ contadormaquina);
    }

    void mostrarPuntosJugador(int contador){
        System.out.println("Tus puntos: "+ contador);
    }

    void mostrarTurnoCroupier(){
        System.out.println("TURNO CROUPIER:");
    }
}
