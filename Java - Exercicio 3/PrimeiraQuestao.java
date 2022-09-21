import java.util.*;

class PrimeiraQuestao {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        int value = 0;

        for (int i=0; i < 10; i++) {
            a[i] = 10 - i;

            value += (2 * i) +1;
            b[i] = value;

            if (i > 5)
                c[i] = (i -5) * 10;
            else
                c[i] = i;

        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}