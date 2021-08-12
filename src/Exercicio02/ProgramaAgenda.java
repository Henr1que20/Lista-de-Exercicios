package Exercicio02;

import java.util.List;

public class ProgramaAgenda {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Pessoa pessoa1 = new Pessoa(0,"Deodoro da Fonseca", 50,1.7);
        Pessoa pessoa2 = new Pessoa(1,"Floriano Peixoto", 51,1.8);
        Pessoa pessoa3 = new Pessoa(2,"Prudente de Morais", 65,1.85);
        Pessoa pessoa4 = new Pessoa(3,"Campos Sales", 46,1.79);
        Pessoa pessoa5 = new Pessoa(4,"Rodrigues Alves", 39,1.69);
        Pessoa pessoa6 = new Pessoa(5,"Júlio Prestes", 70,1.88);
        Pessoa pessoa7 = new Pessoa(6,"Getúlio Vargas", 47,1.92);
        Pessoa pessoa8 = new Pessoa(7,"José Linhares", 48,1.83);
        Pessoa pessoa9 = new Pessoa(8,"Juscelino Kubitschek", 66,1.76);
        Pessoa pessoa10 = new Pessoa(9,"Jânio Quadros", 54,1.9);

        agenda.armazenaPessoa(pessoa1);
        agenda.armazenaPessoa(pessoa2);
        agenda.armazenaPessoa(pessoa3);
        agenda.armazenaPessoa(pessoa4);
        agenda.armazenaPessoa(pessoa5);
        agenda.armazenaPessoa(pessoa6);
        agenda.armazenaPessoa(pessoa7);
        agenda.armazenaPessoa(pessoa8);
        agenda.armazenaPessoa(pessoa9);
        agenda.armazenaPessoa(pessoa10);

        List <Pessoa> pessoas = agenda.getPessoa();

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        boolean busca = agenda.buscarPessoa("Henrique Oliveira");

        if (busca){
            System.out.println("Pessoa encontrada com sucesso!!");
        }else{
            System.out.println("Pessoa nao encontrada");
        }


    }
}
