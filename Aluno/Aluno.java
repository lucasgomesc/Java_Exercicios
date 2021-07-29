package exercicios.Aluno;

public class Aluno {
    public String Nome;
    public int Codigo;
    public double N[] = new double[3];
    private double Media;
    public String Situacao;

public Aluno(String Nome, int Codigo, double N1, double N2, double N3) {
        this.Nome = Nome;
        this.Codigo = Codigo;
        this.N[0] = N1;
        this.N[1] = N2;
        this.N[2] = N3;
        CalcularMedia();
        }

public void setNota(int id, double N) {
        if ((id < 1) || (id > this.N.length)) return;
        this.N[id - 1] = N;
        CalcularMedia();
        }

public double getNota(int id) {
        if ((id < 1) || (id > N.length)) return 0;
        return N[id - 1];
        }

private void CalcularMedia() {
        double somatorio = 0;
        for (int i = 0; i < N.length; i++) {
        somatorio += N[i];
        }
        Media = somatorio / N.length;
        Situacao();
        }

private void Situacao() {
        if (Media > 7) {
        this.Situacao = "aprovado";
        } else if (Media > 5) {
        this.Situacao = "exame";
        } else {
        this.Situacao = "reprovado";
        }
        }

public String toString() {
        String out = "";
        out += "Nome(" + Nome + ") ";
        out += "Codigo(" + Codigo + ") ";
        out += "Media(" + Media + ") ";
        out += "Situacao(" + Situacao + ") ";
        return out;

    }
}