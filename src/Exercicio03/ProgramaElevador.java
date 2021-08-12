package Exercicio03;

public class ProgramaElevador {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(10, 8);

        ElevadorAcoes eAcoes = new ElevadorAcoes();

        System.out.println(elevador);

        eAcoes.entrar(elevador, 5);

        //elevador.entrar(5);

        System.out.println(elevador);

        //elevador.entrar(4);
        eAcoes.entrar(elevador, 4);

        System.out.println(elevador);

        //elevador.desce();
        eAcoes.desce(elevador);

        //elevador.sobe();
        eAcoes.sobe(elevador);
        System.out.println(elevador);

        //elevador.sair(5);
        eAcoes.sair(elevador, 5);

        System.out.println(elevador);

    }
}
