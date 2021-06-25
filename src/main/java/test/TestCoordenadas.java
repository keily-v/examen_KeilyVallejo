package test;

import dominio.Coordenadas;
import java.util.Random;
import java.util.Scanner;

public class TestCoordenadas {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        Random radon = new Random();

        System.out.println("Cuántos movimientos desea realizar:");
        int n = datos.nextInt();
        Coordenadas[] coordenadas = new Coordenadas[n];
        pedirCoordenadas(coordenadas);
        System.out.println("Los puntos son: ");
        for (Coordenadas c : coordenadas) {
            System.out.println(c);
        }

    }

    public static void pedirCoordenadas (Coordenadas[] coor ) {
        Random randon = new Random();
        int x,y; 

        for (int i = 0; i < coor .length; i++) {
            datos.nextLine();
            System.out.println("Punto Nro :"+(i+1));
            System.out.println("Coordenada en x:");
            x = datos.nextInt();
            System.out.println("Coordenada en y:");
            y = datos.nextInt();
            coor [i] = new Coordenadas(x,y);
        }
    }
    
    public static void dirigirCoordenadas(){
    
    
    
    }
}
/*
package punto_cartesiano;

import java.util.Scanner;


public class Punto_cartesiano {

    
    public static void main(String[] args) {
        Punto T1;
        Punto T2;
        Scanner entrada=new Scanner(System.in);
        int x=0;
        int y=0;
        int opcion=0;
        int incremento=0;
        int cantidadM=0,contadorM=0;
        T1=new Punto(x,y);
        T2=new Punto(x,y);
        System.out.println("\n Posicion Actual (X;Y): ("+T1.getX()+", "+T1.getY()+")");
        
        System.out.println("\n\t. Menú.\n");
        System.out.print("Digite la cantidad de Movimientos: ");
        cantidadM=entrada.nextInt();
        System.out.print("Digite la cantidad de espacios a moverse: ");
        incremento=entrada.nextInt();
       
                do {
                //Genero movimiento arriba, abajo, izquierda,derecha aleatorios entre 1 y 4
                double movimiento=Math.random()*3+1;
                opcion=(int)movimiento;
                switch(opcion){
                    case 1: T1.moverArriba(incremento); break;
                    case 2: T1.moverAbajo(incremento); break;
                    case 3: T1.moverDerecha(incremento); break;
                    case 4: T1.moverIzquierda(incremento); break;
                    case 5: break;
                    default: System.out.println("Error"); break;
                }

                System.out.println("\n Posicion (X;Y): ("+T1.getX()+", "+T1.getY()+")");
                contadorM++;
                    } while (contadorM<cantidadM); 
    }
    
}*/