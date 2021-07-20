package exercicios;

import java.util.Scanner;

//IMPRIMA UM INTERVALO DE VALORES E IMPRIMA OS VALORES IMPARES ENTRE ELES

public class ValoresImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, i;

        System.out.println("Insira o primeiro valor: ");
        a = entrada.nextInt();
        System.out.println("Insira o segundo valor: ");
        b = entrada.nextInt();

        if (a > b) {
            System.out.println("Insira o valor de 'A' menor que 'B'!!");
        }

        System.out.println("Os numeros impares entre 'A' e 'B' são: ");
        if (a % 2 == 0) {
            a++;
            System.out.print(a + " ");
        }
        while (a <= (b-2)) {
            a += 2;
            System.out.print(a + " ");
        }
    }
}
