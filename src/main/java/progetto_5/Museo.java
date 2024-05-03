package progetto_5;

public class Museo {
    private String nome;
    private int postiLiberi = 5;

    public Museo(String nome){
        this.nome = nome;
    }

    public synchronized long guarda(Turista t) throws Exception{
        if(postiLiberi < 1){
            System.out.println(t.getNome());
        }

        postiLiberi--;

        return (long)Math.random() * 10000;
    }

    public synchronized void esci(){
        postiLiberi++;
    }
}
