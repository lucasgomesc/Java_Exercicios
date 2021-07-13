package exercicios;

import javax.swing.*;

public class Idade {
    public static void main(String[] args) {
        int ano, mes, dia;

        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade em anos: "));
        mes = ano * 12;
        dia = ano * 365;

        JOptionPane.showMessageDialog(null, "Sua idade em anos, meses e dias respectivamente é: "
        + ano + " anos, " + mes + " meses, " + dia + " dias");

    }
}
