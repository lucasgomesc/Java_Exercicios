package exercicios;

import java.util.Scanner;

// Cria uma rotina em Java que permita calcular a soma dos valores em um vetor de cinco elementos

public class Vetor {
    public static void main(String[] args) {
        int n = 5;
        int vetor[] = new int[n];
        int a, b, c, d, e;

        System.out.println("Insira 5 numeros: ");
        Scanner leitor = new Scanner(System.in);

        a = leitor.nextInt();
        b = leitor.nextInt();
        c = leitor.nextInt();
        d = leitor.nextInt();
        e = leitor.nextInt();

        int soma;
        soma = (a + b + c + d + e);

        System.out.println("A soma dos valores em um vetor é: " + soma);
    }
}