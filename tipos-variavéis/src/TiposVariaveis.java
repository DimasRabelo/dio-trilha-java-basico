public class TiposVariaveis {
    public static void main(String[] args) {

        // Tipos primitivos

        // Tipos inteiros
        byte idade = 20;
        short ano = 2023;
        int cep = 12345678;
        long cpf = 12345678910L;

        // Tipos reais
        float pi = 3.14F;
        double salario = 1275.33;

        // Tipos booleanos (exemplo de uso)
        boolean verdadeiro = true;
        boolean falso = false;

        // Tipos caractere
        char letra = 'A';

        // Variáveis referenciais
        String nome = "Lucas";
        String texto = "Olá, meu nome é " + nome + "!";

        // Constantes
        final double SALARIO_MINIMO = 2500;

        // Conversão de tipos
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Impressão de alguns valores
        System.out.println(texto);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Salário mínimo: R$ " + SALARIO_MINIMO);
    }
}
