import java.util.Scanner;
public class boasvindas {
    public static void main(String[] args) {
        System.out.println("Informe seu nome: ");
        Scanner no = new Scanner(System.in);
        String nome = no.nextLine();
        no.close();
        
        
        System.out.println( "Olá " + nome  + ", " + 
        "É um prazer te conhecer!");
         
    }
}
