import java.util.Scanner;


public class mediadenota{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua primeira nota: ");
        float notaA = entrada.nextFloat();
        System.out.println("Informe sua segunda nota: ");
        float notaB = entrada.nextFloat();
        entrada.close();
        float media = (notaA + notaB)/2;
        if (media <= 6){
            System.out.println("Você ficou abaixo da média! Mas não se preocupe, você consegue recuperar. Você ficou com " 
            + media + " de media. Bons Estudos!");
        }else{
            System.out.println("É isso ai!! Você estudou, se dedicou e foi aprovado com media de " + media + " PARABENS!!");
        }

       
        

    }
}