import java.util.Scanner;

public class ExemploCondicao2 {


    //  Quero adicionar um desconto gradativo
    //  Valor Maior que 1000 - 10%
    //  Valor Maior que 2000 - 20%
    //  Valor Maior que 3000 - 30%
    //  Valor Menor igual a 1000 - 0%

    public static void main(String[] args) {

        double valorBruto = 3000;
        double desconto = 0d;

        //  Operadores lógicos
        //  && = e
        //  || = ou

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do bruto: ") ;
        valorBruto = scanner.nextDouble();

        if (valorBruto > 1000 && valorBruto <= 2000) {
            desconto = valorBruto * 0.10;
        } else if (valorBruto > 2000 && valorBruto < 3000) {
            desconto = valorBruto * ( 20 / 100);
        } else if (valorBruto >= 3000) {
            desconto = valorBruto * 0.3;
        }
        double saldo = valorBruto - desconto;

        System.out.println("Valor bruto é : " + valorBruto);
        System.out.println("Valor desconto é : " + desconto);
        System.out.println("Valor com desconto é : " + saldo);
        System.out.println("Valor líquido é : " + (valorBruto - desconto));

    }


}
