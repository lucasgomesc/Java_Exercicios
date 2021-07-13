package exercicios;

public class AntecessorSucessor {
    private  int numero;
        public AntecessorSucessor(int norm){
            this.numero = norm;
            this.antt();
            this.succes();
        }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private void antt(){
        System.out.println("Numero antecessor é: "+ (numero -1));
    }
    private void succes(){
        System.out.println("Numero sucessor é: "+ (numero +1));
    }
}
