import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Interia implements Browser{

    private String urlInteriaReg = "https://konto-pocztowe.interia.pl/#/nowe-konto/darmowe";
    private Robot robot;

    @Override
    public void openDefaultBrowser() {

        try {
            Desktop.getDesktop().browse(new URI(urlInteriaReg));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void getUrl() {

    }


    public void eneterRegDetail() {
        try {
            robot = new Robot();
            robot.setAutoDelay(40);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        robot.delay(3000);

        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }


    }




}
