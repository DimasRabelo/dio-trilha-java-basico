public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean variavel1 = true;
        boolean variavel2 = true;

      
      if (variavel1 && variavel2) {
            System.out.println("Ambas as variáveis são verdadeiras.");
        } 

         if (variavel1 || variavel2) {
            System.out.println("Umas das variáveis é verdadeiras.");
        } 
      
      System.out.println("fim");
      
      
      
    
      
      
        // E
       // System.out.println(variavel1 && variavel2); // false

        // OU
       // System.out.println(variavel1 || variavel2); // true

        // XOR
       // System.out.println(variavel1 ^ variavel2); // true

        // NOT
       // System.out.println(!variavel1); // false

        // Comparação
       // System.out.println(variavel1 == variavel2); // false
    }
}
