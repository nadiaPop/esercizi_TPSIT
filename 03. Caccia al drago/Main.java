//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner inTastiera = new Scanner(System.in);

        System.out.println("Inserisci il numero di battiti da far eseguire al drago: ");
        int count = inTastiera.nextInt();

        Thread argo = new Thread(new Drago("Argo", count));
        argo.start();

        Cavaliere sanGiorgio = new Cavaliere("San Giorgio");
        sanGiorgio.lanciaDardi(argo);

        for (int i = 0; i < count; i++) {
            System.out.println("Main sta osservando il drago... i = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}