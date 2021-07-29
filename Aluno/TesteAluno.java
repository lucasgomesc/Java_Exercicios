package exercicios.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno[] = new Aluno[3];

        aluno[0] = new Aluno("Lucas", 305, 8.5, 9, 8);
        aluno[1] = new Aluno("Carlos", 149, 3, 5, 4);
        aluno[2] = new Aluno("Odete", 071, 4, 7, 7);

        for (int i = 0; i < aluno.length; i++) {
            System.out.println(aluno[i]);
        }
    }
}
