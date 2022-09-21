import java.util.*;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira to tamanho do array: ");

        int tamanho = scanner.nextInt();

        System.out.println("Insira os numeros, negativos ou positivos, para popular o array: ");

        int[] numeros = new int[tamanho];

        for (int i=0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        int quantidade_de_negativos = 0;

        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] < 0)
                quantidade_de_negativos += 1;
        }

        System.out.println(String.format("no array tem %d numeros negativos", quantidade_de_negativos));
    }
}