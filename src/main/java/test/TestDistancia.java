package test;

import dominio.Distancia;
import java.util.Random;
import java.util.Scanner;

public class TestDistancia {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        Random radon = new Random();

        System.out.println("Cuántos movimientos desea realizar:");
        int n = datos.nextInt();
        Distancia[] distancias = new Distancia[n];

    }

    public static void puntosAleatorios(Distancia[] dis) {
        Random randon = new Random();
        System.out.println("Cuántos pasos quiere dar en x:");
        int x = datos.nextInt();
        System.out.println("Cuántos pasos quiere dar en y:");
        int y = datos.nextInt();
        int[][] coordenadas = new int[2][2];

        for (int i = 0; i < dis.length; i++) {
            
            
        }
        String punto =" ";
               
        for (int i = 0; i < dis.length; i++) {
            for (int j = 0; j < dis.length; j++) {
                coordenadas[i][j] = randon.nextInt(10);
                
            }
        }
        

    }
}
