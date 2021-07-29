package exercicios.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro gol = new Carro("Wolkswagen", "branca", "XYZ9803");
        Carro uno = new Carro("Fiat", "vermelha", "ABC4445");

        System.out.println(gol);
        System.out.println(uno);

        gol.ligar();
        gol.acelerarAte(20);
        gol.mudarMarcha('2');
        System.out.println(gol);
        System.out.println(uno);

        uno.ligar();
        gol.acelerarAte(50);
        gol.mudarMarcha('3');
        uno.acelerarAte(10);
        uno.mudarMarcha('2');
        System.out.println(gol);
        System.out.println(uno);
        }
}

