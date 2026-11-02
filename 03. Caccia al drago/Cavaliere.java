public class Cavaliere {

    private String nome;

    public Cavaliere(String nome) {
        this.nome = nome;
    }

    public void lanciaDardi(Thread d) throws InterruptedException {
        for (int i=0; i<=20 && !d.interrupted(); i++) {
            try {
                Thread.sleep(10);
                d.interrupt();
                System.out.println(nome + " sta cercando di colpire il drago! Colpo n. " + (i+1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
