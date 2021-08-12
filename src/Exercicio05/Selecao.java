package Exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Selecao extends Controle{

    private List<Caminhao> caminhaoList = new ArrayList<>();

    public List<Caminhao> getCaminhaoList() {
        return caminhaoList;
    }

    public void setCaminhaoList(List<Caminhao> caminhaoList) {
        this.caminhaoList = caminhaoList;
    }

    public void registrarCaminhao(){

        boolean regisCaminhao = true;
        boolean regisPluviometro;

        while(regisCaminhao){

            System.out.println("Dados do caminhao");
            System.out.println("Informe o tipo de caminhao: (1 - Alfa | 2 - Beta) ");
            int tipoCaminiao = this.leInteiro();
            System.out.println("Informe a capacidade do caminhao: ");
            double capacidadeCaminhao = this.leInteiro();
            Caminhao caminhao = new Caminhao(capacidadeCaminhao, tipoCaminiao);

            regisPluviometro = true;
            System.out.println("Dados do Pluviometro");

            while (regisPluviometro){

                System.out.println("Informe o tipo do Pluviometro: (1 = Analogico | 2 - Digital)");
                int tipoPluviometro = this.leInteiro();
                caminhao.addPluviometro(new Pluviometro(tipoPluviometro));
                System.out.println("Para adicionar mais um Pluviometro digite 'SIM' ");
                System.out.println("Para sair digite 'Fim'");
                String continua = this.leString();
                regisPluviometro = !"Fim".equals(continua);

            }

            this.caminhaoList.add(caminhao);

            System.out.println("Para adicionar mais um Caminhao digite 'Sim' ");
            System.out.println("Para sair digite 'Fim' ");
            String continua = this.leString();
            regisCaminhao = !"Fim".equals(continua);
        }
    }

    public void melhorCaminhao(){
        Caminhao melhorCaminhao = new Caminhao();
        for(Caminhao caminhao : this.getCaminhaoList()){
            if(caminhao.getCapacidade() > melhorCaminhao.getCapacidade()){
                melhorCaminhao = caminhao;
            }
        }

        System.out.println("O melhor camilhao ");
        System.out.println("Numero:  " + (this.getCaminhaoList().indexOf(melhorCaminhao) + 1));
        System.out.println("Tipo: " + melhorCaminhao.getTipo());
        System.out.println("Pluviometro");
        for(Pluviometro pluviometro : melhorCaminhao.getPluviometros()){
            System.out.println("--"+ (melhorCaminhao.getPluviometros().indexOf(pluviometro) + 1) + " Pluviometros --");
            System.out.println("Tipo: " + pluviometro.getTipo());
            System.out.println("Capacidade: " + pluviometro.getCapacidade());
            System.out.println("Peso: " + pluviometro.getPeso());
        }

    }


}
