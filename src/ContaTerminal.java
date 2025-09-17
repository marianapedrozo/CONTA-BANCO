import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
       
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            // Declaração das variáveis para armazenar os dados da conta
            int numero;
            String agencia;
            String nomeCliente;
            double saldo;

            // Solicita e lê o número da agência
            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.nextLine();

            // Solicita e lê o número da conta
            System.out.println("Agora, por favor, digite o número da Conta!");
            numero = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha após ler o número

            // Solicita e lê o nome do cliente
            System.out.println("Por favor, digite o seu nome completo!");
            nomeCliente = scanner.nextLine();

            // Solicita e lê o saldo
            System.out.println("Por favor, digite o saldo inicial da conta!");
            saldo = scanner.nextDouble();

            // Exibe a mensagem final com as informações inseridas
            String mensagemFinal = "Olá ".concat(nomeCliente)
                    .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                    .concat(agencia).concat(", conta ").concat(String.valueOf(numero))
                    .concat(" e seu saldo ").concat(String.valueOf(saldo))
                    .concat(" já está disponível para saque.");

            System.out.println(mensagemFinal);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, certifique-se de digitar o tipo de dado correto.");
        }
    }
}