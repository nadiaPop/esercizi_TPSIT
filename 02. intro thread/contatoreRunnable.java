public class contatoreRunnable implements Runnable{

    private int count;
    private String nome;

    public contatoreRunnable(String nome, int count) {
        setNome(nome + " thread contatore che implementa l'interfaccia Runnable");
        this.count = count;
    }

    @Override
    public void run() {
        for (int i=0; i<count; i++) {
            System.out.println(this.getNome() + " conta " + (i+1));
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
