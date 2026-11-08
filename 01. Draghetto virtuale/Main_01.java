public class Main_01 {
    public static void main(String[] args) {
        draghettoVirtuale draghetto1 = new draghettoVirtuale("Fiamma");
        draghettoVirtuale draghetto2 = new draghettoVirtuale("Spirito");

        draghetto1.mostraStato();
        draghetto2.mostraStato();

        draghetto1.vola(25);
        draghetto1.gioca();
        draghetto1.mangia();
        
        draghetto2.gioca();
        draghetto2.vola(15);
        draghetto2.gioca();
        draghetto2.gioca();
        draghetto2.mangia();
        draghetto2.riposa();

        draghetto1.mostraStato();
        draghetto2.mostraStato();

    }
}