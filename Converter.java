package exercicios;

import java.util.Scanner;

// CONVERSAO DE DOLARES E EUROS

public class Converter {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cotacao_dolar, cotacao_euro, valor_dolar,valor_real, valor_euro;
        int opcao;

        System.out.print("---CONVERSOR DE MOEDA---\n\n");

        System.out.println("Digite o numero da opção desejada: ");
        System.out.println("1 - Conversão de dolar em reais\n2 - Conversão de reais em dolar\n3 - Conversão de euro em " +
                "reais\n4 - Conversão de reais em euro \n");

        System.out.printf("OPÇÃO DESEJADA: ");
        opcao = entrada.nextInt();
        System.out.println("------------------------------------");
        if (opcao==1) {
            System.out.print("Digite a cotação do dolar: ");
            cotacao_dolar = entrada.nextDouble();

            System.out.print("Digite o valor em dolar: ");
            valor_dolar = entrada.nextDouble();

            System.out.println("------------------------------------");
            valor_real = cotacao_dolar * valor_dolar;

            System.out.print("O Valor em reais é: ");
            System.out.printf("%.2f", valor_real);
        } else if (opcao==2) {
            System.out.print("Digite a cotação do dolar: ");
            cotacao_dolar = entrada.nextDouble();

            System.out.print("Digite o valor em reais: ");
            valor_real = entrada.nextDouble();

            System.out.println("------------------------------------");
            valor_dolar = valor_real / cotacao_dolar;

            System.out.print("O Valor em dolares é: ");
            System.out.printf("%.2f", valor_dolar);
        } else if (opcao==3){
            System.out.print("Digite a cotação do euro: ");
            cotacao_euro = entrada.nextDouble();

            System.out.print("Digite o valor em euro: ");
            valor_euro = entrada.nextDouble();

            System.out.println("------------------------------------");
            valor_real = cotacao_euro * valor_euro;

            System.out.print("O Valor em reais é: ");
            System.out.printf("%.2f", valor_real);
        } else if (opcao==4) {
            System.out.print("Digite a cotação do euro: ");
            cotacao_euro = entrada.nextDouble();

            System.out.print("Digite o valor em reais: ");
            valor_real = entrada.nextDouble();

            System.out.println("------------------------------------");
            valor_euro = valor_real / cotacao_euro;

            System.out.print("O Valor em euro é: ");
            System.out.printf("%.2f", valor_euro);
        }

    }

}