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
    public void golesXornada(String[] filas, String[] columnas, int[][] matriz) {
        int[][] auxMatriz = ClonarArrays.biInt(matriz);
        String[] auxFilas = ClonarArrays.uniString(filas);

        int auxmatriz;
        String auxfilas;
        for (int c = 0; c < matriz[0].length; c++) {
            for (int f = 0; f < matriz.length; f++) {
                for (int i = f+1; i < matriz.length; i++) {
                    if (matriz[f][c] < matriz[i][c]) {
                        auxmatriz = matriz[f][c];
                        matriz[f][c] = matriz[i][c];
                        matriz[i][c] = auxmatriz;
                        auxfilas = filas[f];
                        filas[f] = filas[i];
                        filas[i] = auxfilas;
                    }
                }
            }
            System.out.println(columnas[c]+": "+filas[0]);
            matriz = ClonarArrays.biInt(auxMatriz);
            filas = ClonarArrays.uniString(auxFilas);
        }
    }
    public void equipoXornada(String[] filas, String[] columnas, int[][] matriz) {
        int[][] auxMatriz = ClonarArrays.biInt(matriz);
        int[] gXornada = new int[columnas.length];

        int auxmatriz;
        for (int c = 0; c < matriz[0].length; c++) {
            for (int f = 0; f < matriz.length; f++) {
                for (int i = f+1; i < matriz.length; i++) {
                    if (matriz[f][c] < matriz[i][c]) {
                        auxmatriz = matriz[f][c];
                        matriz[f][c] = matriz[i][c];
                        matriz[i][c] = auxmatriz;
                    }
                }
            }
            gXornada[c] = matriz[0][c];
            matriz = ClonarArrays.biInt(auxMatriz);
        }
        //Selecciona o maior número de goles entre tódalas xotrnadas
        int auxgxornada;
        for (int i = 0; i < gXornada.length; i++) {
            for (int j = i + 1; j < gXornada.length; j++) {
                if (gXornada[i] < gXornada[j]) {
                    auxgxornada = gXornada[i];
                    gXornada[i] = gXornada[j];
                    gXornada[j] = auxgxornada;
                }
            }
        }
        int nf = 0;
        int nc = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (matriz[f][c] == gXornada[0]) {
                    nf = f;
                    nc = c;
                }
            }
        }
        System.out.println("Equipo: "+filas[1]+"\n"+gXornada[0]+" goles na xornada "+columnas[nc]);
    }
    public void consultasGoles(String[] equipos, String[] xornadas, int[][] goles) {
        String nomequipo = PedirDatos.pedirString("Introduce o nome do equipo: ");
        int numequipo;
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i].equals(nomequipo)) {
                numequipo = i;
            }
        }
        String nomxornada = PedirDatos.pedirString("Introduce a xornada: ");
        int numxornada;
        for (int i = 0; i < xornadas.length; i++) {
            if (xornadas[i].equals(nomxornada)) {
                numxornada = i;
            }
        }



    }
}
