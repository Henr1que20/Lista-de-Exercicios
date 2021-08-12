package Exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Caminhao {
    private double capacidade;
    private List<Pluviometro> pluviometros;
    private String tipo;

    public Caminhao(double capacidade, int tipo) {
        this.setCapacidade(capacidade);
         this.setTipo(tipo);
         pluviometros = new ArrayList<>();
    }

    public Caminhao() { }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (tipo == 1){ this.tipo = "Alfa";}else{ this.tipo = "Beta"; }
    }

    public void addPluviometro(Pluviometro pluviometro){
        this.pluviometros.add(pluviometro);
    }

    public List<Pluviometro> getPluviometros() {
        return pluviometros;
    }

    public void setPluviometros(List<Pluviometro> pluviometros) {
        this.pluviometros = pluviometros;
    }


}
