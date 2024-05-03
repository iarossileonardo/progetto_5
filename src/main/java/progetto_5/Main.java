package progetto_5;

public class Main {
    public static void main(String[] args) {
        int nTuristi = 25;
        Museo m = new Museo("Uffizzi");
        Turista t[] = new Turista[nTuristi];
        for(int i = 0; i < nTuristi; i++){
            t[i] = new Turista(m, i);
        }

        for(int i = 0; i < nTuristi; i++){
            t[i].start();
        }
    }
}