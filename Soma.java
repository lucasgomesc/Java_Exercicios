package exercicios;

import javax.swing.*;

//Inserção e dois valores e depois a soma deles

public class Soma {
    public static void main(String[] args) {
        double a, b, soma;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor: "));

        soma = a + b;

        JOptionPane.showMessageDialog(null, "O valor da soma é: " +   soma);
    }
}
