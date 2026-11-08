public class Drago_03 implements Runnable{

    private String nome;
    int numBattiti;

    public Drago_03(String nome, int numBattiti) {
        this.numBattiti = numBattiti;
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i=0; i < numBattiti && !Thread.interrupted(); i++) {
            System.out.println(nome + " si libra nell'aria! Gioia immensa, al battito " + (i+1));
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println(nome + " - " + e);
//            }
        }
    }

}
