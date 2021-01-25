package Lesson6;

public class App {
    public static void main(String[] args) {
        int[] ints;
        ints = new int[]{1, 3, 5, 4, 4, 3, 2};
    }

    public static int[] conv(int[] inInts) {
        int fourIndex=0;
        for (int i = 0; i < ints.length; i++) {

            if (inInts[i] == 4) {
                fourIndex = i;
            }else
        }
        int[] outInts = new int[inInts.length - fourIndex];
    }
}
