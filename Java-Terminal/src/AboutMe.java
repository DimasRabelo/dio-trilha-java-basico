import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu Nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua Idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua Altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Ola, Me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha Altura É: " + altura + "cm");
        }

        // os argumentos começam com indice 0
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
    }
}
