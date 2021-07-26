package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Pessoa> pessoa;

    public Agenda() {
        this.pessoa = new ArrayList<Pessoa>();
    }

    public void armazenaPessoa(Pessoa pessoa){
        this.pessoa.add(pessoa);
    }

    public void removePessoa(int posicao){
        this.pessoa.remove(posicao);
    }

    public boolean buscarPessoa( String nome){
       boolean busca = false;
       for (Pessoa pessoa : getPessoa()){
           if (pessoa.getNome().equalsIgnoreCase(nome)) {
               busca = true;
           }
       }
       return busca;

    }

    public List<Pessoa> getPessoa(){
        return pessoa;
    }

}
