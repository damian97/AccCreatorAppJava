import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Interia{

    private String url;

    public Interia(String url) {
        this.url = url;
        openDefaultBrowser(url);
    }


    public void openDefaultBrowser(String url) {

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }


    public void getUrl() {

    }







}
