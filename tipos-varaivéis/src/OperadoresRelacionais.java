public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        String nome1 = "Lucas";
        String nome2 = new String ("Lucas");

        //System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));
        
        
        
        
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2; 

        if (numero1 == numero2) {
            System.out.println("a nossa condição é verdadeira");
        }
        
         System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2? " + simNao);

         simNao = numero1 > numero2;

        System.out.println("numero1 é maior que o numero2? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numero1 é menor que o numero2? " + simNao);
        


       
    }
}
