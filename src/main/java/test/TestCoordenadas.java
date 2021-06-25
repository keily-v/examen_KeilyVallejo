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
        Random aleatorio = new Random();
        int x, y;

        int opcion;
        int mover = (int) (Math.random() * 4 + 1);
        datos.nextLine();
        System.out.println("Punto inicial");
        System.out.println("Coordenada en x:");
        x = datos.nextInt();
        System.out.println("Coordenada en y:");
        y = datos.nextInt();
        for (int i = 0; i < coor.length; i++) {

            coor[i] = new Coordenadas(x, y);
            System.out.println("Digite el nùmero del movimiento que desea para el punto ");
            System.out.println("1.-Arriba");
            System.out.println("2.-Abajo");
            System.out.println("3.-Derecha");
            System.out.println("4.-Izquierda");
            opcion = datos.nextInt();

            if (opcion == 1) {
                y = y + mover;
                System.out.println("x: "+x+",y: "+y);
            } else if (opcion == 2) {
                y = y - mover;
                System.out.println("x: "+x+",y: "+y);
            } else if (opcion == 3) {
                x = x + mover;
                System.out.println("x: "+x+",y: "+y);
            } else if (opcion == 4) {
                x = x - mover;
                System.out.println("x: "+x+",y: "+y);
            } else {
                System.out.println("ERROR");
            }
            coor[i]= new Coordenadas(x,y);
        }

    }
}
