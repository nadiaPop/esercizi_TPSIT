import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inTastiera = new Scanner(System.in);
        System.out.println("Inserisci un intero positivo: ");
        int count = inTastiera.nextInt();
        inTastiera.close();

        contatoreThread johnNash = new contatoreThread("john", count);
        Thread leoFibonacci = new Thread(new contatoreThread("leo", count));

        johnNash.start();
        leoFibonacci.start();

        for (int i=0; i<count; i++) {
            System.out.println("Il main conta " + (i+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}