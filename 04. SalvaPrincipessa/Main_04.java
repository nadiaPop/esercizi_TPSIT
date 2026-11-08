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

        Thread sangiorgio = new Thread(new Cavaliere_04("sangiorgio", draghi.get(0)));

        for (Thread t:draghi) {
            t.start();
        }
        
        System.out.println("I draghi sono partiti per distruggere il villagio");
        sangiorgio.start();
        System.out.println("Il cavaliere ha atterrato il drago!");
    }
}