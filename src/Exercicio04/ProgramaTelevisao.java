package Exercicio04;

public class ProgramaTelevisao {
    public static void main(String[] args) {
        Televisao televisao = new Televisao(20,5, true);
        ControleRemoto controle = new ControleRemoto(televisao);

        System.out.println(televisao);

        controle.aumentarVolume();
        System.out.println(televisao);

        controle.diminuirVolume();
        System.out.println(televisao);

        controle.aumentarCanal();
        System.out.println(televisao);

        controle.diminuirrCanal();
        System.out.println(televisao);

        controle.trocarParaCanalIndicado(60);
        System.out.println(televisao);

    }
}
