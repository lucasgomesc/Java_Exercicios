package exercicios;

import javax.swing.*;

public class Reajuste {
    public static void main(String[] args) {
        Double valor;

        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o saldo: " ));
        JOptionPane.showMessageDialog(null, "O valor do saldo com reajuste de 1% é: R$ "
        + valor * 1.01);
    }
}
