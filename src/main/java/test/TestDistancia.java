package test;

import dominio.Coordenadas;
import java.util.Random;
import java.util.Scanner;

public class TestDistancia {

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
}
