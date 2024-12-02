import javax.swing.JOptionPane;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;

        if (nota >= 7)
            JOptionPane.showMessageDialog(null, "Aprovado");

        else if (nota >= 5 && nota < 7)
            JOptionPane.showMessageDialog(null, "Prova Recuperaçao");
        else
            JOptionPane.showMessageDialog(null, "Reprovado");
    }
}
