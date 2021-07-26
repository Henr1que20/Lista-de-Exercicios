package Exercicio04;

public class Televisao {
    private int volume;
    private int canal;
    private boolean ligado;

    public Televisao(int volume, int canal, boolean ligado) {
        this.volume = volume;
        this.canal = canal;
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
       if(ligado){
           return "Status da Televisao " +
                   "\nVolume: " + volume +
                   "\nCanal: " + canal + "\n";
       }
       return "TV desligada";
    }
}
