import java.util.*;

class PrimeiraQuestao {
    public static String getDiaDaSemana(int numero) {
        switch(numero) {
            case 0:
                return "segunda";
            
            case 1:
                return "terça";
            
            case 2:
                return "quarta";
            
            case 3:
                return "quinta";
            
            case 4:
                return "sexta";
            
            case 5:
                return "sábado";
            
            case 6:
                return "domingo";
            
            default:
                return "desconhecido";
        }
    }

    public static void main(String[] args) {
        
        System.out.println("insira o numero de um dia da semana (ex:. 0):");

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("Boa " + getDiaDaSemana(numero));
    }
}