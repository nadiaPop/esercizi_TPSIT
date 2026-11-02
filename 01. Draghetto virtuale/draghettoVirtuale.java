public class draghettoVirtuale {
    
    private String nome;
    private int energia;
    private int fame;

    public draghettoVirtuale(String nome) {
        this.nome = nome;
        this.energia = 100;
        this.fame = 30;
    }

    private void checkStato() {
        if (energia < 0) {
            energia = 0;
        }
        if (energia > 100) {
            energia = 100;
        }
        if (fame < 0) {
            fame = 0;
        }
        if (fame > 100) {
            fame = 100;
        }
    }

    private void avvisaUtente() {
        if (energia <= 20) {
            System.out.println(nome + " è stanco! Fai riposare il draghetto.");
        }
        if (fame >= 80) {
            System.out.println(nome + " ha molta fame! Dagli da mangiare.");
        }
    }

    public void mangia() {
        fame = fame - 20;
        checkStato();
        System.out.println(nome + " sgranocchia un marshmallow vulcanico! Fame ridotta.");
        avvisaUtente();
    }

    public void vola(int numBattiti) {
        energia = energia - numBattiti;
        fame = fame + numBattiti;
        checkStato();
        for (int i=0; i<numBattiti; i++) {
            System.out.println("Sto volando!\n");
        }
        avvisaUtente();
    }

    public void gioca() {
        energia = energia - 20;
        fame = fame + 15;
        checkStato();
        System.out.println(nome + " fa un salto mortale e sputa una fiammella! Divertimento puro!");
        avvisaUtente();
    }

    public void riposa() {
        energia = energia + 40;
        checkStato();
        System.out.println(nome + " si appallottola e fa un pisolino... Zzz...");
        avvisaUtente();
    }

    public void mostraStato() {
        System.out.println(nome + "\nEnergia: " + energia + "\nFame: " + fame);
    }

}
