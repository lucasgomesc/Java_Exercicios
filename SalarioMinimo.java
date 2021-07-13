package exercicios;

import javax.swing.*;

public class SalarioMinimo {
    public static void main(String[] args) {
        float salM = 1100;
        float sal, qnt;

        sal = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do seu salário: "));
        qnt = sal / salM;

        JOptionPane.showMessageDialog(null, "O seu salário é equivalente a: " + qnt + " salarios minimos");

    }
}