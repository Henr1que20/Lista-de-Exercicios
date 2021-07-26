package Exercicio03;

public class ProgramaElevador {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(10, 8);

        System.out.println(elevador);

        elevador.entrar(5);

        System.out.println(elevador);

        elevador.entrar(4);
        System.out.println(elevador);

        elevador.desce();
        elevador.sobe();
        System.out.println(elevador);

        elevador.sair(5);
        System.out.println(elevador);

    }
}
