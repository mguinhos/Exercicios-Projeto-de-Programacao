import java.util.*;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira varios numeros. (para finalizer: -1):");

        int numero = scanner.nextInt();
        int total_de_numeros = 1;

        while (numero != -1) {
            numero = scanner.nextInt();
            total_de_numeros += 1;
        }

        scanner.close();

        System.out.println(String.format("Foram digitados %d numeors", total_de_numeros));
    }
}
