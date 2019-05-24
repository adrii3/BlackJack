package com.company;

import java.util.Random;
import java.util.Scanner;

public class MainOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int decision;
        int contador= 0;
        int diferencia;

        int numeromaquina;
        int contadormaquina=0;
        int diferenciamaquina;

        System.out.println("Juegas? Si=1, No=2");
        decision=sc.nextInt();

        while(decision==1){
            numero= new Random().nextInt(11)+1;
            System.out.println(numero);
            contador=contador+numero;
            System.out.println("Contador: "+contador);
            System.out.println("Sigues jugando? ");
            decision=sc.nextInt();
        }
        System.out.println("TURNO CROUPIER:");
        if(contador!=0){
            while(contadormaquina<=17){
                numeromaquina=new Random().nextInt(11)+1;
                System.out.println("Jugada croupier: "+numeromaquina);
                contadormaquina=contadormaquina+numeromaquina;
                System.out.println("Contador croupier: "+ contadormaquina);
                System.out.println(" ");
            }
        }
        System.out.println("Tus puntos: "+ contador);
        System.out.println("Puntuacion maquina: "+contadormaquina);
        if(contador>21){
            System.out.println("Has perdido");
        }else if(contadormaquina>21){
            System.out.println("Has ganado");
        } else if (contador<=21 && contadormaquina<=21){
            diferencia=21-contador;
            diferenciamaquina=21-contadormaquina;
            if(diferenciamaquina==diferencia){
                System.out.println("EMPATE");
            }else if(diferencia>diferenciamaquina){
                System.out.println("HAS PERDIDO");
            }else{
                System.out.println("HAS GANADO");
            }
        }
    }
}
