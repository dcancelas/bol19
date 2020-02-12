package bol19;

import java.util.Arrays;

public class Metodos {

    public int[][] rexistrarGoles(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = PedirDatos.pedirInt();
            }
        }
        return matriz;
    }
    public void amosarMatriz(String[] filas, String[] columnas, int[][] matriz) {
        System.out.print("   ");
        for (int i = 0; i < columnas.length; i++) {
            System.out.print(" "+columnas[i]);
        }
        for (int f = 0; f < matriz.length; f++) {
            System.out.println("");
            System.out.print(filas[f]+" ");
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c]);
                if (matriz[f][c] >= 10) System.out.print(" ");
                else System.out.print("  ");
            }
        }
    }
    public void ordearGoles(String[] filas, int[][] matriz) {
        int[] sumaGoles = new int[matriz.length];
        for (int f = 0; f < matriz.length; f++) {
            sumaGoles[f] = 0;
            for (int c = 0; c < matriz[f].length; c++) {
                sumaGoles[f] = (sumaGoles[f] + matriz[f][c]);
            }
        }

        int[] auxSumaGoles = new int[sumaGoles.length];
        String[] auxFilas = new String[filas.length];
        System.arraycopy(sumaGoles, 0, auxSumaGoles, 0, sumaGoles.length);
        System.arraycopy(filas, 0, auxFilas, 0, filas.length);

        int auxsumagoles;
        String auxfilas;
        for (int i = 0; i < sumaGoles.length; i++) {
            for (int j = i+1; j < sumaGoles.length ; j++) {
                if (sumaGoles[i] > sumaGoles[j]) {
                    auxsumagoles = sumaGoles[i];
                    sumaGoles[i] = sumaGoles[j];
                    sumaGoles[j] = auxsumagoles;
                    auxfilas = filas[i];
                    filas[i] = filas[j];
                    filas[j] = auxfilas;
                }
            }
        }
        for (int i = 0; i < sumaGoles.length; i++) {
            System.out.print("\n"+filas[i]+": "+sumaGoles[i]+" goles");
        }

        System.arraycopy(auxSumaGoles, 0, sumaGoles, 0, auxSumaGoles.length);
        System.arraycopy(auxFilas, 0, filas, 0, auxFilas.length);
    }
}
