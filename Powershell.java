import java.awt.*;
import java.awt.event.KeyEvent;

public class Powershell extends Thread {
    @Override
    public void run() {
        try {
            Robot robot = new Robot();
            while (true) {
                robot.keyPress(KeyEvent.VK_WINDOWS);
                robot.keyPress(KeyEvent.VK_X);
                robot.keyRelease(KeyEvent.VK_WINDOWS);
                robot.keyRelease(KeyEvent.VK_X);
                robot.delay(50);
                robot.keyPress(KeyEvent.VK_I);
                robot.keyRelease(KeyEvent.VK_I);
            }
        } catch (AWTException e) {
            //throw new RuntimeException(e);
        }
    }
}
