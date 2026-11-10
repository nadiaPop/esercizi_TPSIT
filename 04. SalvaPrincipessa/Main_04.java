//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main_04 {
    public static void main(String[] args) {
        ArrayList<Thread> draghi = new ArrayList<>();
        for (int i=0; i<3; i++) {
            Thread t = new Thread(new SputaFuoco(String.valueOf(i)));
            draghi.add(t);
        }

        System.out.println("I draghi si levano in volo per andare a distruggere il villaggio!")

        Thread sangiorgio = new Thread(new Cavaliere_04("sangiorgio", draghi.get(0)));

        System.out.println("Il cavaliere si prepara per difendere il villaggio!")

        try {
            for (Thread t:draghi) {
                t.join();
            }
            sangiorgio.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

//        System.out.println("I draghi sono partiti per distruggere il villagio");
//        sangiorgio.start();
//        System.out.println("Il cavaliere ha atterrato il drago!");
    }
}