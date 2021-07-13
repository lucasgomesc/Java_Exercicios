package exercicios;

import java.util.Scanner;

//Insira um valor e será printado os numeros da contagem de forma regressiva

public class Regressiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, cont;

        System.out.println("Insira um valor para contagem: ");
        i = entrada.nextInt();

        while (i > 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("Fim da contagem regressiva!");
    }
}
