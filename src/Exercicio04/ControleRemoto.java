package Exercicio04;

public class ControleRemoto {
    private int volumeMaximo;
    private int canalMaximo;
    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        if(televisao == null){
            throw new RuntimeException();
        }
        this.televisao = televisao;
        this.volumeMaximo  = 100;
        this.canalMaximo  = 1000;
    }

    public boolean aumentarVolume(){
        if (televisao.isLigado()){
            int volume = televisao.getVolume();
            if (volume < this.volumeMaximo) {
                volume++;
                televisao.setVolume(volume);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean diminuirVolume(){
        if (televisao.isLigado()){
            int volume = televisao.getVolume();
            if(volume > 0){
                volume--;
                televisao.setVolume(volume);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean aumentarCanal(){
       if (televisao.isLigado()){
           int canel = televisao.getCanal();
           if(canel < canalMaximo){
               canel++;
               televisao.setCanal(canel);
               return true;
           }
           return false;
       }
       return false;
    }

    public boolean diminuirrCanal(){
        if (televisao.isLigado()){
            int canel = televisao.getCanal();
            if(canel > 1){
                canel--;
                televisao.setCanal(canel);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean trocarParaCanalIndicado(int canal){
        if (televisao.isLigado()){
            if(canal > 0 && canal < canalMaximo+1){
                televisao.setCanal(canal);
                return true;
            }
            return false;
        }
        return false;
    }





}
