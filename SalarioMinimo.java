package exercicios;

import javax.swing.*;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
 */
public class SalarioMinimo {
    public static void main(String[] args) {
        float salM = 788f;
        float sal, qnt;

        sal = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do seu salário: "));
        qnt = sal / salM;

        JOptionPane.showMessageDialog(null, "O seu salário é equivalente a: " + qnt + " salarios minimos");

    }
}