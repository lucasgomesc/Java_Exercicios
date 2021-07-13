package exercicios;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner entradaA = new Scanner(System.in);
        Scanner entradaB = new Scanner(System.in);
        int a, b;

        System.out.println("Insira o valor de A: ");
        a = entradaA.nextInt();
        System.out.println("Insira o valor de B: ");
        b = entradaB.nextInt();

        if (a > b) {
            System.out.println("O maior valor é: " + a);
        } else if (b > a) {
            System.out.println("O maior valor é: " + b);
        } else if (a == b) {
            System.out.println("Os valores são iguais");
        }

    }
}
