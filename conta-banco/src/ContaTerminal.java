import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Coletando os dados do usuário
        System.out.println("============== Pablwo Bank ==============");
        System.out.println("Bem vindo ao Pablwo Bank!");
        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.next();
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        System.out.print("Por favor, digite o número da conta (*APENAS DIGITOS): ");
        int numero = scanner.nextInt();
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        // Limpando o terminal
        System.out.print("\033\143");

        // Imprimindo a saída
        System.out.println("============== Pablwo Bank ==============");
        System.out.println(
            String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nome, agencia, numero, saldo
            ));
        System.out.println("============== Pablwo Bank ==============");
    }
}
