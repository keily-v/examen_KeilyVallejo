package test;

import dominio.Coordenadas;
import java.util.Random;
import java.util.Scanner;

public class TestCoordenadas {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Cuántos movimientos desea realizar:");
        int n = datos.nextInt();
        Coordenadas[] coordenadas = new Coordenadas[n];
        pedirCoordenadas(coordenadas);
        System.out.println("Los puntos son: ");
        for (Coordenadas c : coordenadas) {
            System.out.println(c);
        }

    }

    public static void pedirCoordenadas(Coordenadas[] coor) {

        int x, y;

        int opcion;
        
        

        x = 0;
        y = 0;
        for (int i = 0; i < coor.length; i++) {
            int mover = ( (int) (Math.random() * 10+5)) ;
            System.out.println("Digite el nùmero del movimiento que desea para el punto ");
            System.out.println("1.-Arriba");
            System.out.println("2.-Abajo");
            System.out.println("3.-Derecha");
            System.out.println("4.-Izquierda");
            opcion = datos.nextInt();

            if (opcion == 1) {
                y = y + mover;
                System.out.println("x: " + x + ",y: " + y);
            } else if (opcion == 2) {
                y = y - mover;
                System.out.println("x: " + x + ",y: " + y);
            } else if (opcion == 3) {
                x = x + mover;
                System.out.println("x: " + x + ",y: " + y);
            } else if (opcion == 4) {
                x = x - mover;
                System.out.println("x: " + x + ",y: " + y);
            } else {
                System.out.println("ERROR");
            }
            coor[i] = new Coordenadas(x, y);
        }

    }

    public double calcularDistancia(Coordenadas coor[]) {
        
        String [] di;
        for (int i = 0; i < coor.length; i++) {
            for (int j = 0; j < coor.length - 1; j++) {
                
                di[i]= Math.sqrt((coor[j].getX()-)^2);
                
            }
        }

        return 0;
    }
}
