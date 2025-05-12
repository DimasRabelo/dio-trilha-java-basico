public class Operadores {
    public static void main(String[] args) {
      String concatenacao = "?";
      concatenacao = 1 + 1 + 1 + "1";   
        System.out.println(concatenacao); // 31

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao); // 1111

        concatenacao = 1 + "1" + 1 + "1"; 
        System.out.println(concatenacao); // 1111
        
        concatenacao = "1" + 1 + 1 + 1; 
        System.out.println(concatenacao); // 1111
        
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao); // 14

        // Operadores aritméticos

        int numero1 = 10;
        int numero2 = 20;

        int soma = numero1 + numero2;   

        System.out.println("Soma: " + soma); // 30

        
        
        
    





    }
}
