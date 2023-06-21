package relogio;

public class Tempo {
    private int hora;
    private int min;
    private int seg;

    public Tempo(){
        hora = 0;
        min = 0;
        seg = 0;
    }
    public Tempo(int h){

        if( (h >= 0) && (h <= 24) ){
            this.hora = h;

        } else
            hora = 0;
            min = 0;
            seg = 0;
    }

    public Tempo(int h, int m){

        if( (h >= 0) && (h <= 24) ){
            this.hora = h;

        }else hora = 0;

        if( (m >= 0) && (m <= 59) ){
            this.min = m;

        }else
            min = 0;
            seg = 0;
    }
    public Tempo(int h, int m, int s){

        if( (h >= 0) && (h <= 24) ){
            this.hora = h;

        }else hora = 0;

        if( (m >= 0) && (m <= 59) ){
            this.min = m;

        }else min = 0;

        if( (s >= 0) && (s <= 59) ){
            this.seg = s;

        }else seg = 0;

    }


    //Método toString() retorna o tempo no formato 00:00:00
    @Override
    public String toString() {
        String aux = "";
        if (hora < 9){
            aux += "0" + hora + ":";

        }else aux += hora + ":";

        if(min < 9){
            aux += "0"+min+":";

        }else aux += min+":";

        if(seg < 9){
            aux += "0"+seg;

        }else aux += seg;

        return aux;
    }

    public boolean setHora(int hora) {
        if( (hora >= 0) && (hora <= 24) ){
            this.hora = hora;
            return true;

        }else{
            this.hora = 0;
            return false;
        }
    }

    public boolean setMin(int min) {
        if( (min >= 0) && (min <= 59) ){
            this.min = min;
            return true;

        }else{
            this.min = 0;
            return false;
        }
    }

    public boolean setSeg(int seg) {
        if( (seg >= 0) && (seg <= 59)){
            this.seg = seg;
            return true;

        }else{
            this.seg = 0;
            return false;
        }
    }

    // Tempo em Segundos
    public long tempoEmSegundos(){
        long segundos = seg;
        long aux = hora * 60;
        aux = aux + min;
        segundos = segundos + (aux * 60);
        return segundos;
    }

    // Diferença entre eles
    public long difTempo(Tempo tAux){
        long tauxT = tAux.tempoEmSegundos();
        long tPrin = tempoEmSegundos();
        long tAuxT = tauxT - tPrin;
        return  tAuxT;

    }

}

