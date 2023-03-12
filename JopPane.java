import javax.swing.*;

public class JopPane extends JFrame {
    JopPane(){
        JOptionPane.showMessageDialog(null, "VIRUS", "KILL YOURSELF", JOptionPane.ERROR_MESSAGE);
        delay(70);
        JOptionPane.showMessageDialog(null, "VIRUS", "KILL YOURSELF", JOptionPane.INFORMATION_MESSAGE);
        delay(71);
        JOptionPane.showMessageDialog(null, "VIRUS", "KILL YOURSELF", JOptionPane.PLAIN_MESSAGE);
        delay(70);
    }

    private static void delay(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
