import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String tipoConta = "Corrente";
        double saldo = 1600.00;
        double receber, transferir;
        int operacao;


        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("******************************************************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("******************************************************************************");


        do {
            System.out.println("\nOperações:");
            System.out.println("1 - Consultar Saldo.");
            System.out.println("2 - Receber Valor.");
            System.out.println("3 - Transferir Valor.");
            System.out.println("4 - Sair.");
            System.out.println("\nDigite a opção desejada:");
            operacao = scanner.nextInt();

            if (operacao == 1) {
                System.out.println("Seu saldo é de: " + saldo);
            }

            if (operacao == 2) {
                System.out.println("Digite o valor que irá receber:");
                receber = scanner.nextDouble();
                saldo += receber;
                System.out.println("O seu saldo atualizado é de: " + saldo);
            }

            if (operacao == 3) {
                System.out.println("Digite o valor à transferir: ");
                transferir = scanner.nextDouble();
                if (transferir > saldo) {
                    System.out.println("Saldo Insuficiente.");
                } else {
                    saldo -= transferir;
                    System.out.println("O seu saldo atualizado é de : " + saldo);
                }

            }

            if (operacao == 4) {
                System.out.println("Saindo do programa.");
                break;
            }
            if (operacao > 4 && operacao <= 0) {
                System.out.println("Operação invalida.");
                System.out.println("Digite novamente a operação.");
            }


        } while (true);
    }
}
