import javax.swing.JOptionPane;

public class TugasPBO {
    public static void main(String[] args) {
        // Menampilkan dialog input
        String input = JOptionPane.showInputDialog(null, "Anda sedang belajar apa?", "Input", JOptionPane.QUESTION_MESSAGE);
        
        // Menampilkan dialog message
        JOptionPane.showMessageDialog(null, "Belajar " + input + " sangat mudah", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
