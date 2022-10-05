import java.util.*;

class ContaBancaria {
    int numero = 0;
    int saldo = 0;

    ContaBancaria(int saldo) {
        Random random = new Random();

        this.numero = random.nextInt(9999);
        this.saldo = saldo;
    }

    public String formatar() {
        return "Conta { numero: " + this.numero + "; saldo: " + this.saldo + "; }";
    }
    
    public int obter_saldo() {
        return this.saldo;
    }

    public int saque(int valor) {
        this.saldo -= saldo;

        return this.saldo;
    }

    public int deposito(int valor) {
        this.saldo += valor;

        return this.saldo;
    }
}

class Cliente {
    String nome;
    String cpf;
    ContaBancaria conta = null;

    Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void adicionar_conta(ContaBancaria conta) {
        this.conta = conta;
    }

    public void remover_conta() {
        this.conta = null;
    }

    public String formatar() {
        if (this.conta != null)
            return "Cliente { nome: " + this.nome + "; cpf: " + this.cpf + "; conta: " + this.conta.formatar() + "; }";
        
        return "Cliente { nome: " + this.nome + "; cpf: " + this.cpf + "; }";
    }

    public void listar() {
        System.out.println(this.formatar());
    }
}

class PrimeiraQuestao {
    public static void main(String[] args) {
        System.out.println("Criada conta com deposito inicial de 100 R$");

        Cliente cliente = new Cliente("cliente", "108.075.524-12");
        ContaBancaria conta_bancaria = new ContaBancaria(100);

        cliente.adicionar_conta(conta_bancaria);

        System.out.println("Depositando mais 100 R$");
        conta_bancaria.deposito(100);

        cliente.listar();
    }
}