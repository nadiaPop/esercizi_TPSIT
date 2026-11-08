public class LanciaPietre extends Drago_04{
    public LanciaPietre(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5 && !Thread.interrupted(); i++) {
            System.out.println(nome + " lancia una pietra e si libra nell'aria! Gioia immensa, al battito " + (i + 1));
        }
    }
}
