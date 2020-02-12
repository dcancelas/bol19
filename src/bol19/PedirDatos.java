package bol19;

import java.util.Scanner;

public class PedirDatos {

    public static int pedirInt(){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Introduce un numero: ");
        a = sc.nextInt();
        return a;
    }
    public static int pedirInt(String mensaxe){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print(mensaxe);
        a = sc.nextInt();
        return a;
    }
    public static float pedirFloat(){
        Scanner sc = new Scanner(System.in);
        float b;
        System.out.print("Introduce un numero: ");
        b = sc.nextFloat();
        return b;
    }
    public static float pedirFloat(String mensaxe){
        Scanner sc = new Scanner(System.in);
        float b;
        System.out.print(mensaxe);
        b = sc.nextFloat();
        return b;
    }
    public static String pedirString(String mensaxe){
        Scanner sc = new Scanner(System.in);
        String c;
        System.out.print(mensaxe);
        c = sc.next();
        return c;
    }
}
