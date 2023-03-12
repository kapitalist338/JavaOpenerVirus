import java.awt.*;
import java.awt.event.KeyEvent;

public class Close extends Thread{
    @Override
    public void run() {
        try {
            Robot robot = new Robot();

            while (true) {
                robot.keyPress(KeyEvent.VK_WINDOWS);
                robot.keyPress(KeyEvent.VK_D);
                robot.keyRelease(KeyEvent.VK_D);
                robot.keyRelease(KeyEvent.VK_WINDOWS);
                robot.delay(200);
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
