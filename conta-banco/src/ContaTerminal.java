import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: "Imprtar a classe Scanner"
        Scanner input = new Scanner(System.in);

        // Solicitando dados do usuário
        System.out.print("Digite seu nome completo: ");
        String nomeCliente = input.nextLine();
        System.out.print("Digite o número da Agência: ");
        String agencia = input.nextLine();
        System.out.print("Por favor. digite o número da conta: ");
        int numero = Integer.parseInt(input.nextLine());
        System.out.print("Por favor, insira o saldo: ");
        double saldo = Double.parseDouble(input.nextLine());

        // Saida de dados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disppnível para saque.");
    }
}
