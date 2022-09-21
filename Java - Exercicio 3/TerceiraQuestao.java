import java.util.*;

class TerceiraQuestao {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] a_reverso = new int[10];

        for (int i=0; i < 10; i++) {
            a[i] = 10 - i;
        }

        for (int i=0; i < a.length; i++) {
            a_reverso[i] = a[a.length - 1 -i];
        }

        System.out.println("Array original: " + Arrays.toString(a));
        System.out.println("Array reverso: " + Arrays.toString(a_reverso));
    }
}