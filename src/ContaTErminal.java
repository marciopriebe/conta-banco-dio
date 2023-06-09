import java.util.Locale;
import java.util.Scanner;

public class ContaTErminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, para criar um conta em nosso banco precisamos dos seguintes dados: " +
                "Nome, Cpf e o valor do primeiro depósito.");

        System.out.println("Primeiro digite o seu nome: ");
        String nome = scanner.next();


        System.out.println("Agora digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Agora digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por último digite o valor que você gostaria de realizar no primeiro depósito: " );
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é " +
                numeroConta + " e seu saldo inicial de R$ " + saldo + " já está disponível para saque.");



    }
}
