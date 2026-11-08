//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) throws InterruptedException {

        Scanner inTastiera = new Scanner(System.in);
        
        System.out.println("Inserisci il numero di battiti da far eseguire al drago: ");
        int count = inTastiera.nextInt();
        inTastiera.close();

        Thread argo = new Thread(new Drago_03("Argo", count));
        argo.start();

        Cavaliere_03 sanGiorgio = new Cavaliere_03("San Giorgio");
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