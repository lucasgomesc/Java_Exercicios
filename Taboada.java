import java.util.Scanner;

//TABOADA

public class Taboada {
    public static void main(String[] args) {
        int n, i;
        Scanner taboada = new Scanner(System.in);

        System.out.println("Qual numero você deseja fazer a taboada? ");
        n = taboada.nextInt();

        for (i=0; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
