package exercicios;

import java.util.Scanner;

/* Crie uma classe java ComparaNumero que contenha um método que receba
dois números e indique se são iguais ou se são diferentes. Mostre o maior e o
menor (nesta sequência). */

public class ComparaNumero {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int a, b;

        System.out.println("Insira um valor: ");
        a = entrada1.nextInt();
        System.out.println("Insira outro valor: ");
        b = entrada2.nextInt();

        if (a == b) {
            System.out.println("Os numeros inseridos são iguais.");
        } else {
            System.out.println("Os numeros inseridos são diferentes");
        }

        if (a > b) {
            System.out.println("O maior numero é: " + a + " e o menor é: " + b);
        } else if (b > a) {
            System.out.println("O maior numero é: " + b + " e o menor é: " + a);
        } else if (a == b) {
            System.out.println("Os numeros possum os mesmo valor");
        }

    }
}
