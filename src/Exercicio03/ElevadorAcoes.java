package Exercicio03;

public class ElevadorAcoes {

    public boolean entrar(Elevador e, int numeroPessoas){

        if (numeroPessoas > 0){
            if (e.getQuantidadePessoas() <= e.getCapacidadeElevador()){
                if (e.getQuantidadePessoas() == e.getCapacidadeElevador()){
                    return false;
                }
                int espacoVazio = e.getCapacidadeElevador() - e.getQuantidadePessoas();

                int pessoaQuantidade = 0;
                if (numeroPessoas <= espacoVazio){
                    pessoaQuantidade = e.getQuantidadePessoas();;
                    pessoaQuantidade += numeroPessoas;
                    e.setQuantidadePessoas(pessoaQuantidade);
                    return true;
                }else{
                    int esperarProximo = numeroPessoas - espacoVazio;
                    pessoaQuantidade = e.getQuantidadePessoas();

                    pessoaQuantidade += numeroPessoas - esperarProximo;
                    e.setQuantidadePessoas(pessoaQuantidade);

                    System.out.println(esperarProximo + " pessoa(s) vai no proximo elevador");
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean sair(Elevador e, int numeroPessoas){
        if (numeroPessoas > 0){
            if (numeroPessoas <= e.getQuantidadePessoas()){
                int pessoasQuantidade = e.getQuantidadePessoas();
                pessoasQuantidade -= numeroPessoas;
                e.setQuantidadePessoas(pessoasQuantidade);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean sobe(Elevador e){
        int subir = e.getAndarAtual();
        if(e.getAndarAtual() < e.getTotalAndares()){
            subir += 1;
            e.setAndarAtual(subir);
            return true;
        }
        return false;
    }

    public boolean desce(Elevador e){
        int descer = e.getAndarAtual();
        if(e.getAndarAtual() == 0){
            System.out.println("Quer ir p centro da terra?, ja esta no terreo!!");
            return false;
        }
        descer -= 1;
        e.setAndarAtual(descer);
        return true;
    }

}
