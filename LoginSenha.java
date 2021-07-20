package exercicios;

import java.util.Scanner;

public class LoginSenha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Login > ");
        String login = in.nextLine();

        System.out.println("Senha > ");
        String senha = in.nextLine();

        if (login.equals("Lucas")&& senha.equals("Lucas3005*")){
            System.out.printf("Usuario %s logado com sucesso. ", login);
        } else {
            System.out.println("Login ou senha invalidos!");
        }
    }
}
