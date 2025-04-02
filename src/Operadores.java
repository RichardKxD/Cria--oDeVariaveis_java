public class Operadores {
    public static void main(String[] args) {
       
        String concatenacao = "?";
       
        concatenacao = 1 + 1 + 1 + "1";    // nesse código estamos vendo que o operador + é um operador de soma e de concatenação 
        System.out.println(concatenacao); 
        
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao); 
       
        concatenacao = 1 + 1 + "1" + 1;
        System.out.println(concatenacao);

    }

}
