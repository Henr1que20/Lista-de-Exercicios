package Exercicio05;

import java.util.Scanner;

public class Controle {

    Scanner sc = new Scanner(System.in);

    public String leString() {
        return this.getScan().nextLine();
    }

    public int leInteiro(){
        return Integer.parseInt(this.getScan().nextLine());
    }

    public Scanner getScan(){
        return sc;
    }

}
