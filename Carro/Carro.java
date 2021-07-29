package exercicios.Carro;

public class Carro {
 	public String marca;
 	public String cor;
 	public String placa;
 	public Integer velocidadeAtual;
 	public char marchaAtual;
 	public Boolean freioDeMaoPuxado;
 	public Boolean chaveVirada;

 	public Carro(String marca, String cor, String placa) {
 		this.marca = marca;
 		this.cor = cor;
 		this.placa = placa;
 		this.velocidadeAtual = 0;
 		this.marchaAtual = '0';
 		this.freioDeMaoPuxado = true;
 		this.chaveVirada = false;
 	}

	public void ligar() {
		chaveVirada = true;
		freioDeMaoPuxado = false;
		marchaAtual = '1';
	}

    public void acelerarAte(Integer velocidade) {
	    if (!chaveVirada) return;
        if (freioDeMaoPuxado) return;
        if (marchaAtual == '0') return;
        velocidadeAtual = velocidade;
	}

	public void mudarMarcha(char marcha) {
        marchaAtual = marcha;
        	}

       	public void parar() {
       	acelerarAte(0);
       		freioDeMaoPuxado = true;
       	chaveVirada = false;
       	marchaAtual = '1';
       	}

    public String toString() {
		String out = "";
		out += "Marca(" + marca + ") ";
		out += "Cor(" + cor + ") ";
		out += "Placa(" + placa + ") ";
		out += "Chave(" + chaveVirada + ") ";
    	out += "Freio(" + freioDeMaoPuxado + ") ";
    	out += "Marcha(" + marchaAtual + ") ";
    	out += "Veloc(" + velocidadeAtual + ")";
    	return out;
 	}
}
