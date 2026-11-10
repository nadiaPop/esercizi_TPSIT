import javax.swing.*;

public class WriteToFile {

    public String ScriviDentroUnFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleziona il file in cui salvare il testo: ");

        int selezioneUtente = fileChooser.showSaveDialog(null);

        if (selezioneUtente != JFileChooser.APPROVE_OPTION)
    }
}
