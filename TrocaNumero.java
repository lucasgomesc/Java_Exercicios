package exercicios;

import java.util.Scanner;

public class TrocaNumero {
    public static void main(String[] args) {
        Scanner NumA = new Scanner(System.in);
        Scanner NumB = new Scanner(System.in);
        int a, b;

        System.out.println("Impressão na ordem inversa");
        System.out.println("Insira um numero: ");
        a = NumA.nextInt();
        System.out.println("Insira outro numero: ");
        b = NumB.nextInt();

        System.out.println("Você inseriu: " + a + " e " + b);
        System.out.println("Mas eu sou o sistema vida loka e imprimo o ao contrario:");
        System.out.println(b);
        System.out.println(a);

    }
}
