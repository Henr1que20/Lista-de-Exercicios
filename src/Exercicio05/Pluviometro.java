package Exercicio05;

public class Pluviometro {
    private String tipo;
    private int capacidade;
    private int peso;

    public Pluviometro(int tipo) {
        this.setTipo(tipo);
        this.setCapacidade(tipo);
        this.setPeso(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {

        if(tipo == 1){
            this.tipo = "analogico";
        }else{
            this.tipo = "digital";
        }

        this.setCapacidade(tipo);
        this.setPeso(tipo);
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int tipo) {
        if(tipo == 1){
            this.capacidade = 3000;
        }else{
            this.capacidade = 4000;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int tipo) {
        if(tipo == 1){
            this.peso = 10;
        }else{
            this.peso = 20;
        }
    }
}
