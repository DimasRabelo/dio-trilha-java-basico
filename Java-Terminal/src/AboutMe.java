import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite sua Altura: ");
            double altura = Double.parseDouble(scanner.nextLine());

            System.out.println("Olá, Me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha Altura é: " + altura + "cm");

        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Os campos Idade e Altura aceitam apenas números válidos.");
        }
    }
}



 // os argumentos começam com índice 0
        /*
         * String nome = args[0];
         * String sobrenome = args[1];
         * int idade = Integer.parseInt(args[2]);
         * double altura = Double.valueOf(args[3]);
         * 
         * System.out.println("Ola, Me chamo " + nome + " " + sobrenome);
         * System.out.println("Tenho " + idade + " anos");
         * System.out.println("Minha Altura É: " + altura + "cm");
         */