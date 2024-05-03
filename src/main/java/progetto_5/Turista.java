package progetto_5;

public class Turista extends Thread{

    private Museo m;
    private long durata;
    private int nome;

    public Turista(Museo m, int nome){
        this.m = m;
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            long attesa = 2000 + (long)Math.random() * 1000;
            System.out.println("Il turista-" + nome + " attende per " + (attesa / 1000) + "s");
            this.sleep(attesa);
            durata = m.guarda(this);
            System.out.println("Il turista-" + nome + " guarda per " + (durata / 1000) + "s");
            this.sleep(durata);
            m.esci();
            System.out.println("Il turista-" + nome + " è uscito");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public int getNome() {
        return nome;
    }


    
}
