package exercicios;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/*Crie um programa que lê a quantidade de garçons de um restaurante e consequente insira o valor de produtos vendidos
e a gorjeta recebida de 4%.
 */
public class Vendedor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Date agora = new Date();
        int q, i;
        double valorVenda, gorjeta;

        System.out.println("-----CALCULO DE PORCENTAGEM DE VENDAS-----");
        System.out.println("Insira a quantidade de garçons: ");
        q = entrada.nextInt();

        for (i=1; i<=q; i++) {
            System.out.println("_____________________________");
            System.out.println("Insira o valor de vendas: ");
            System.out.println("Freelance " + i);
            valorVenda = entrada.nextDouble();
            gorjeta = valorVenda*.04;
            System.out.println("O valor da gorjeta do Freelance " + i + " com 4% é:");
            System.out.printf("%.2f\n", gorjeta);
        }
        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println("\n\nRelatório referente a:");
        System.out.printf(dateToStr);


    }

}
