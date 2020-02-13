package bol19;

public class Main {

    public static void main(String[] args) {
        //int[][] goles = new int[3][3];
        int[][] goles = { {1,2,3}, {4,22,6}, {7,8,9}, };
        String[] equipos = {"CEL","DEP","MAL"};
        String[] xornadas = {"X1","X2","X3"};

        Metodos obx = new Metodos();
        //goles = obx.rexistrarGoles(goles);
        obx.amosarMatriz(equipos, xornadas, goles);
        System.out.println("");
        obx.ordearGoles(equipos, goles);
        System.out.println("\n");
        obx.golesXornada(equipos, xornadas, goles);
        System.out.println("\n");
        obx.equipoXornada(equipos, xornadas, goles);
    }
}
