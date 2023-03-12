import java.awt.*;
import java.awt.event.KeyEvent;

public class Comp extends Thread{
    @Override
    public void run() {
        try {
            while (true) {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_WINDOWS);
                robot.keyPress(KeyEvent.VK_X);
                robot.keyRelease(KeyEvent.VK_WINDOWS);
                robot.keyRelease(KeyEvent.VK_X);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.delay(50);
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
