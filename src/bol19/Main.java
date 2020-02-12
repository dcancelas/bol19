package bol19;

public class Main {

    public static void main(String[] args) {
        //int[][] goles = new int[3][3];
        int[][] goles = { {3,4,2}, {1,2,1}, {3,0,1}, };
        String[] equipos = {"CEL","DEP","MAL"};
        String[] xornadas = {"X1","X2","X3"};

        Metodos obx = new Metodos();
        //goles = obx.rexistrarGoles(goles);
        obx.amosarMatriz(equipos, xornadas, goles);
        System.out.println("");
        obx.ordearGoles(equipos, goles);
        System.out.println("");
        obx.amosarMatriz(equipos, xornadas, goles);
    }
}
