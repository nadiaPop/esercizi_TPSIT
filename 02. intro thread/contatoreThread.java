public class contatoreThread extends Thread{

    private int count;

    public contatoreThread(String nome, int count) {
        setName(nome + " thread contatore che estende la classe Thread");
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i < count; i++) {
            System.out.println(this.getName() + " conta " + (i+1));
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
