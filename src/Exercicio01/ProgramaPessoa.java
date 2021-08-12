package Exercicio01;

import java.util.Calendar;
import java.util.Date;

public class ProgramaPessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Henrique Oliveira", "03-08-2000", 1.9);

        CalculoPesso calculo = new CalculoPesso();

        calculo.calculaIdade(pessoa);

        System.out.println(pessoa);

    }
}
