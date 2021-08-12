package Exercicio03;

public class Elevador {
    private int andarAtual ;
    private int totalAndares;
    private int capacidadeElevador;
    private int quantidadePessoas;

    public Elevador(int totalAndares, int capacidadeElevador) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.quantidadePessoas = 0;

    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public String toString() {
        return "Estamos no andar: "+andarAtual+
             "\nQuantidade de pessoas no Elevador: " + quantidadePessoas + " pessoa(s)";
    }
}
