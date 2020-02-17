package bol19;

public class ClonarArrays {

    public static int[] uniInt(int[] src) {
        int[] target = new int[src.length];
        System.arraycopy(src, 0, target, 0, src.length);
        return target;
    }
    public static String[] uniString(String[] src) {
        String[] target = new String[src.length];
        System.arraycopy(src, 0, target, 0, src.length);
        return target;
    }
    public static int[][] biInt(int[][] src) {
        int length = src.length;
        int[][] target = new int[length][src[0].length];
        for (int i = 0; i < length; i++) {
            System.arraycopy(src[i], 0, target[i], 0, src[i].length);
        }
        return target;
    }
    public static String[][] biString(String[][] src) {
        int length = src.length;
        String[][] target = new String[length][src[0].length];
        for (int i = 0; i < length; i++) {
            System.arraycopy(src[i], 0, target[i], 0, src[i].length);
        }
        return target;
    }
}
