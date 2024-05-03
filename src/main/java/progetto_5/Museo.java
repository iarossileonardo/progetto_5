package progetto_5;

public class Museo {
    private String nome;
    private int postiLiberi = 5;

    public Museo(String nome){
        this.nome = nome;
    }

    public synchronized double guarda(Turista t) throws Exception{
        while(postiLiberi < 1){
            //System.out.println("Il turista " + t.getNome() + " sta aspettando di entrare");
            wait();
        }

        postiLiberi--;

        System.out.println("Posti liberi: " + postiLiberi);

        return Math.random() * 4000 + 1000;
    }

    public synchronized void esci(){
        postiLiberi++;
        notifyAll();
    }
}
