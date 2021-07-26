package Exercicio01;

import java.util.Calendar;
import java.util.Date;

public class ProgramaPessoa {
    public static void main(String[] args) {
        //Date hoje = new Date();

        //Util util = new Util();

        Pessoa pessoa = new Pessoa("Henrique Oliveira", "03-08-2000", 1.9);

        pessoa.calculaIdade(pessoa.getDateNasc(), "dd-MM-yyyy");

        System.out.println(pessoa);

        //System.out.println(util.calculaIdade("03-08-2000","dd-MM-yyyy"));



    }
}
