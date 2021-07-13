package exercicios;

import javax.swing.*;

// Criação de um código que exibe a média de dois valores inseridos

public class Media {
    public static void main(String[] args) {
        double a, b;
        a = 0;
        b = 0;
        String numero = null;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor: "));
        double media = (a + b) / 2;

        JOptionPane.showMessageDialog(null, "A média é: " + media);

    }
}
