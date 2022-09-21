import java.util.*;

public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float soma = 0;
        int n = 10;

        System.out.println(String.format("insira %d numeros", n));

        for (int i=0; i < n; i++) {
            soma += scanner.nextInt();
        }

        scanner.close();

        float media = soma / n;


        System.out.println(String.format("a media dos %d numeros e %f", n, media));
    }
}
