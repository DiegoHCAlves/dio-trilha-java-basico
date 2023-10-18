import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" -------------------------------- ");
        System.out.println("|                                |");
        System.out.println("| Seja bem vindo a Conta Digital |");
        System.out.println("|                                |");
        System.out.println(" -------------------------------- \n");

        System.out.print("Por favor, informe o numero da conta: ");
        int numero = input.nextInt();

        System.out.print("Por favor, informe a agencia: ");
        String agencia = input.next();

        System.out.print("Por favor, informe o nome do cliente: ");
        String nomeCliente = input.next();

        System.out.print("Por favor, informe o saldo: ");
        double saldo = input.nextDouble();

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("                                             ");
        System.out.println("Ola cliente, obrigado por criar uma conta no nosso banco! <3 \n");
        System.out.println("Segue abaixo suas informações credenciais:\n");
        System.out.printf("--> Numero da conta: %d\n--> Numero da Agencia: %s\n--> Nome do cliente: %s\n--> Saldo em conta: %.2f\n\n",numero,agencia,nomeCliente,saldo);
        System.out.println("Vale informar que seu saldo ja esta disponivel para saque viu?");
        System.out.println("------------------------------------------------------------------");

        System.out.println("\n ------------------------------------------- ");
        System.out.println("|                                           |");
        System.out.println("|         Agradecemos a preferência   ;/    |");
        System.out.println("|                                           |");
        System.out.println(" ------------------------------------------- ");
    }
}