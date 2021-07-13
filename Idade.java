package exercicios;

import javax.swing.*;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.*/

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
