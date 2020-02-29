package bol19;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //int[][] goles = new int[3][3];
        int[][] goles = { {1,2,3}, {4,22,6}, {7,8,9}, };
        String[] equipos = {"CEL","DEP","MAL"};
        String[] xornadas = {"X1","X2","X3"};

        Metodos obx = new Metodos();

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                            "1. Amosar matriz"+
                            "\n2. Ordear goles"+
                            "\n3. Amosar goles por xornada"+
                            "\n4. Amosar o equipo con máis goles"+
                            "\n5. Consultar goles"+
                            "\n6. Saír"+
                            "\n\nSelecciona unha opción:"));
            switch (opcion) {
                case 1:
                    System.out.println("");
                    obx.amosarMatriz(equipos, xornadas, goles);
                    break;
                case 2:
                    System.out.println("");
                    obx.ordearGoles(equipos, goles);
                    break;
                case 3:
                    System.out.println("\n");
                    obx.golesXornada(equipos, xornadas, goles);
                    break;
                case 4:
                    System.out.println("\n");
                    obx.equipoXornada(equipos, xornadas, goles);
                    break;
                case 5:
                    System.out.println("\n");
                    obx.consultasGoles(equipos, xornadas, goles);
                    break;
            }
        }while (opcion != 6);
    }
}
