import java.util.Scanner;
import java.util.Locale;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== Bem-vindo ao Sistema de Cadastro ===");

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite seu CPF (apenas números): ");
        String cpf = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso (ex: 80.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Digite seu estado civil: ");
        String estadoCivil = scanner.nextLine();

        System.out.println("\n--- Dados Cadastrados ---");
        System.out.printf("Nome: %s\n", nomeCompleto);
        System.out.printf("CPF: %s\n", cpf);
        System.out.printf("Idade: %d anos\n", idade);
        System.out.printf("Peso: %.2f kg\n", peso);
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("Estado Civil: %s\n", estadoCivil);

        scanner.close();
    }
}