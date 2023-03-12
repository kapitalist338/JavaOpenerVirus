import java.awt.*;
import java.awt.event.KeyEvent;

public class First extends Thread{
    @Override
    public void run() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
