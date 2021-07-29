package exercicios.Calculadora;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1, num2;
        int opcao = 5;

        Scanner entrada = new Scanner(System.in);
        System.out.println("-Escolha uma opção-\n1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n0. Sair\n\nOperação: ");

        opcao = entrada.nextInt();

        while (opcao != 0) {
            Scanner input1 = new Scanner(System.in);

            System.out.println("Qual o primeiro numero: ");
            num1 = input1.nextInt();
            System.out.println("Qual o segundo numero: ");
            num2 = input1.nextInt();

            if ( opcao == 1 ) {
                int operacao = calc.som(num1, num2);
                System.out.printf("\nO resultado da soma é: %d\n", operacao);
                break;
            }
            else if (opcao == 2) {
                int operacao = calc.sub(num1, num2);
                System.out.printf("\nO resultado da subtração é: %d\n", operacao);
                break;
            }
            else if (opcao == 3) {
                int operacao = calc.mult(num1, num2);
                System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);
                break;
            }
            else if (opcao == 4) {
                int operacao = calc.div(num1, num2);
                System.out.printf("\nO resultado da divisão é: %d\n", operacao);
                break;
            }
            else{
                System.out.println("????");
                break;
            }
        }

    }
}
