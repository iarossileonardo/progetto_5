package progetto_5;

public class Turista extends Thread{

    private Museo m;
    private int nome;

    public Turista(Museo m, int nome){
        this.m = m;
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            double attesa = 2000 + Math.random() * 1000;
            System.out.println("Il turista-" + nome + " attende per " + ((int)attesa / 1000) + "s");
            this.sleep((long)attesa);
            double durata = m.guarda(this);
            System.out.println("Il turista-" + nome + " guarda per " + ((int)durata / 1000) + "s");
            this.sleep((long)durata);
            m.esci();
            System.out.println("Il turista-" + nome + " è uscito");
        } catch (Exception e) {}
    }

    public int getNome() {
        return nome;
    }


    
}
