public class AboutMe {
    public static void main(String[] args) {
        // os argumentos começam com indice 0
        String nome = args[0];
        String sobrenome = args[1];  
        int idade = Integer.parseInt(args[2]); 
        double altura = Double.valueOf(args[3]);
        
        System.out.println("Ola, Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha Altura É: " + altura + "cm");
    
    }
}
