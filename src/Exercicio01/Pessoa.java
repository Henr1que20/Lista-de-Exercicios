package Exercicio01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {
    private String nome;
    private int idade;
    private String dateNasc;
    private double altura;

    public Pessoa(String nome, String dateNasc, double altura) {
        this.nome = nome;
        this.dateNasc = dateNasc;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDateNasc() {
        return dateNasc;
    }

    public void setDateNasc(String dateNasc) {
        this.dateNasc = dateNasc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



    @Override
    public String toString() {
        return "Nome: " + nome
              +"\nData de Nascimento: " + dateNasc
              +"\nIdade: " + idade
              +"\nAltura: " + altura;
    }




}
