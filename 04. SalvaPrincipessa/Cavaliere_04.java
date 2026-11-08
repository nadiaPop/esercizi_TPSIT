public class Cavaliere_04 implements Runnable{
    private String nome;
    private Thread dragoDaUccidere;

    public Cavaliere_04(String nome, Thread dragoDaUccidere) {
        this.nome = nome;
        this.dragoDaUccidere = dragoDaUccidere;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        for (int i=0; i<=10 && !dragoDaUccidere.interrupted(); i++) {
            try {
                Thread.sleep(10);
                dragoDaUccidere.interrupt();
                System.out.println(nome + " sta cercando di colpire il drago! Colpo n. " + (i+1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
