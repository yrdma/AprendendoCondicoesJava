import java.util.Scanner;

public class ExemploScaner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        Integer idade = 0;
        Double peso = 0.0;

        System.out.println("Escreva seu nome :");
        nome = sc.next();

        System.out.println("Informe sua idade :");
        idade = sc.nextInt();


        System.out.println("Informe seu peso :");
        peso = sc.nextDouble();

        System.out.println("Seu nome é" + nome);
        System.out.println("Seu peso é" + peso);
        System.out.println("Sua idade é" + idade) ;

    }
}
