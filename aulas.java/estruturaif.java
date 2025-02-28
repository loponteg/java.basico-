import java.util.Scanner;
public class estruturaif {
    public static void main(String[] args) {
        System.out.println("Digite o nome do aluno: ");
        Scanner nome = new Scanner(System.in);
        String nome1 = nome.nextLine();

        System.out.println("Digite sua primeira nota: ");
        Scanner n = new Scanner(System.in);
        float n1 = n.nextFloat();

        System.out.println("Digite sua segunda nota: ");
        Scanner nu = new Scanner(System.in);
        float n2 = nu.nextFloat();
        n.close();
        float media = (n1+n2)/2;


        if (media < 4.6){
            System.out.println(" REPROVADO! ");

        }
        if (media < 6){
            System.out.println(" RECUPERAÇÃO! ");
        }
        else {
            System.out.println(" APROVADO! ");
        }
    }
    
}
