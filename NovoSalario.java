package exercicios;

import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        String nome;
        double salario, sAjustado, somaS = 0f, somaSAjustados = 0f;

//Instanciando e criando um objeto Scanner:
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do funcionário: ");
            nome = entrada.next();

            if (nome.equalsIgnoreCase("FIM"))
                break;

            System.out.println("Digite o salário do funcionário: ");
            salario = entrada.nextDouble();

            somaS += salario;

            if (salario < 600)
                if (salario <= 300)
                    if (salario <= 150)
                        sAjustado = salario * 1.25;
                    else sAjustado = salario * 1.20;
                else sAjustado = salario * 1.15;
            else sAjustado = salario * 1.10;

            somaSAjustados += sAjustado;
            System.out.println(nome + ", salário atual: " + salario + ", salário ajustado: ");
            System.out.printf("%.2f", sAjustado);
            System.out.println(" ");

        }

        System.out.println("Soma dos salários atuais: " + somaS + ", soma dos salários ajustados: "
                + somaSAjustados + ". Diferença: " + (somaSAjustados - somaS) + ".");
    }
}