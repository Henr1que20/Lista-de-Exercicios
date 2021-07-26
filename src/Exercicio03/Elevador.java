package Exercicio03;

public class Elevador {
    private int andarAtual ;
    private int totalAndares;
    private int capacidadeElevador;
    private int quantidadePessoas;

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

    public Elevador(int totalAndares, int capacidadeElevador) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.quantidadePessoas = 0;

    }

    public boolean entrar(int numeroPessoas){

       if (numeroPessoas > 0){
           if (this.quantidadePessoas <= this.capacidadeElevador){
               if (this.quantidadePessoas == this.capacidadeElevador){
                   return false;
               }
               int espacoVazio = this.capacidadeElevador - this.quantidadePessoas;

               if (numeroPessoas <= espacoVazio){
                   this.quantidadePessoas += numeroPessoas;
                   return true;
               }else{
                   int esperarProximo = numeroPessoas - espacoVazio;
                   this.quantidadePessoas += numeroPessoas - esperarProximo;
                   System.out.println(esperarProximo + " pessoa(s) vai no proximo elevador");
                   return true;
               }
           }
           return false;
       }
       return false;
    }


    public boolean sair(int numeroPessoas){
        if (numeroPessoas > 0){
            if (numeroPessoas <= quantidadePessoas){
                this.quantidadePessoas -= numeroPessoas;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean sobe(){
        if(andarAtual < totalAndares){
            andarAtual++;
            return true;
        }
        return false;
    }

    public boolean desce(){
        if(this.andarAtual == 0){
            System.out.println("Quer ir p centro da terra?, ja esta no terreo!!");
            return false;
        }
        this.andarAtual--;
        return true;
    }

    @Override
    public String toString() {
        return "Estamos no andar: "+andarAtual+
             "\nQuantidade de pessoas no Elevador: " + quantidadePessoas + " pessoa(s)";
    }
}
