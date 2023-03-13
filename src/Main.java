import java.awt.*;

public class Main {


    public static void main(String[] args) {


        String urlInteriaReg = "https://konto-pocztowe.interia.pl/#/nowe-konto/darmowe";
        int delaySpeed = 10;

        Color idleButton = new Color(0, 85, 255);
        Color highlightedButton = new Color(0, 69, 207);


        RobotManage rb = new RobotManage();
        rb.setDelaySpeed(delaySpeed);
        User user = new User();
        user.printUser();


//        Interia interia = new Interia(urlInteriaReg);
//        rb.eneterRegDetail();
//        rb.enterCharacters(user.getfName());
//        rb.pressTab();
//        rb.enterCharacters(user.getsName());
//        rb.pressTab();
//        rb.enterCharacters(user.getDay());
//        rb.pressTab();
//        rb.enterOptionPane(user.getMonth());
//        rb.pressTab();
//        rb.enterCharacters(user.getYear());
//        rb.pressTab();
//        rb.enterOptionPane(user.getGender());
//        rb.pressTab();
//        rb.enterCharacters(user.getNickName());
//        rb.pressTab(2);
//        rb.enterCharacters(user.getPass());
//        rb.pressTab();
//        rb.enterCharacters(user.getPass());

        rb.searchColor(idleButton);




    }
}