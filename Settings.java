import java.awt.*;
import java.awt.event.KeyEvent;

public class Settings extends Thread{
    @Override
    public void run() {
        try {
            Robot robot = new Robot();
            while (true) {
                robot.keyPress(KeyEvent.VK_WINDOWS);
                robot.keyPress(KeyEvent.VK_X);
                robot.keyRelease(KeyEvent.VK_WINDOWS);
                robot.keyRelease(KeyEvent.VK_X);
                robot.keyPress(KeyEvent.VK_W);
                robot.keyRelease(KeyEvent.VK_W);
            }
        } catch (AWTException e) {
            throw new RuntimeException();
        }
    }
}
