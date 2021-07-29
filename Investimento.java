package exercicios;

//SIMULAÇÃO DE INVESTIMENTO QUE RENDE MENSALMENTE ATÉ 3%

import java.util.Random;
import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        int i, m, ms = 1;
        double valorInvestido, valorAjuste = 0, valorRend = 0;

        System.out.println("-----SIMULAÇÃO DE INVESTIMENTO-----");
        System.out.println("Quantos meses o dinheiro ficará investido? ");
        m = entrada.nextInt();

        System.out.println("Qual o valor investido? ");
        valorInvestido = entrada.nextDouble();

        for (i=0; i<m; i++) {
            int numeroAleatorio = random.nextInt(4);
            System.out.println("O "+ ms + "° mês vai render: " + numeroAleatorio + "%");
            ms++;

            if (i == 0 ) {
                valorAjuste = (valorInvestido / 100) * numeroAleatorio;
                valorRend = valorInvestido + valorAjuste;
                System.out.println(valorRend + " R$ ");
                System.out.println("______________________");
            } else {
               valorAjuste =  (valorRend / 100) * numeroAleatorio;
               valorRend += valorAjuste;
               System.out.printf("%.2f" + " R$ \n",valorRend);
               System.out.println("______________________");
            }
        }
    }
}
