package exercicios;

import javax.swing.*;


/* Desenvolver um programa que peça ao usuário para cadastrar uma senha, na sequencia, deve pedir ao usuario que digite
duas variaveis reais, e ira calcular a divisão da primeira pela segunda. O programa ira pedir ao usuario que digite sua
senha: Se estiver correta ela mostra o resultado da divisão, senao da mensagem de erro e encerra o aplicativo.
 */

public class CadastroSenha {

    public static void main(String[] args) {
        String cadastroSenha;
        String confirmaSenha;
        double a, b;

        cadastroSenha = JOptionPane.showInputDialog(null, "Senha: ", "", JOptionPane.QUESTION_MESSAGE);

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro numero", "",
                JOptionPane.QUESTION_MESSAGE));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo numero", "",
                JOptionPane.QUESTION_MESSAGE));

        confirmaSenha = JOptionPane.showInputDialog(null, "Digite sua senha: ", "",
                JOptionPane.QUESTION_MESSAGE);

        if (confirmaSenha.equals(cadastroSenha)) {
            System.out.println(a/b);
        } else {
            System.out.println("Senha incorreta!");
        }
        System.exit(0);
    }
}
