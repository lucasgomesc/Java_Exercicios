package exercicios;

import java.io.IOException;
import java.util.Scanner;

//Os divisores do numero inserido
public class Divisores {

public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        for (int i=1; i <= n/2; i++) {
                if ( n % i == 0) System.out.println(i);
        }
        System.out.println(n);
    }
}