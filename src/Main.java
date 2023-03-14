import java.awt.*;

public class Main {


    public static void main(String[] args) {


        String urlInteriaReg = "https://konto-pocztowe.interia.pl/#/nowe-konto/darmowe";
        String urlInteriaLog = "https://poczta.interia.pl/logowanie/";
        String urlTibiaReg = "https://www.tibia.com/account/?subtopic=createaccount";
        int delaySpeed = 10;

        Color idleButton = new Color(0, 85, 255);
        Color highlightedButton = new Color(0, 69, 207);
        Color black = new Color(0, 0, 0);
        Color pink = new Color(231, 131, 131);


        RobotManage rb = new RobotManage();
        rb.setDelaySpeed(delaySpeed);
        User user = new User();
        user.printUser();
        System.out.println("Edycja danych");
        user.setPass("Daman12zaqXSW95");
        user.setNickName("145");
        user.setfName("Damian");
        user.setsName("Kamanski");
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
//        rb.cleanTextArea();
//        rb.enterCharacters(user.getNickName());
//        rb.pressTab(2);
//        rb.enterCharacters(user.getPass());
//        rb.pressTab();
//        rb.enterCharacters(user.getPass());
//
//        rb.searchColors(black);
//        rb.searchColors(idleButton, highlightedButton);
//
//        rb.closeCard();


//        Interia tibia = new Interia(urlTibiaReg);
//        rb.sleep(3000);
//        rb.enterCharacters(user.getNickName());
//        rb.enterAt();
//        rb.enterCharacters("interia.pl");
//        rb.pressTab();
//        rb.enterCharacters(user.getPass());
//        rb.pressTab();
//        rb.enterCharacters(user.getPass());
//        rb.pressTab(2);
//        rb.pressEnter();
//        rb.pressTab(5);
//        rb.pressSpace();
//        rb.pressTab(6);
//        rb.pressEnter();
//        rb.closeCard();

        Interia interia = new Interia(urlInteriaLog);
        rb.sleep(3000);
        rb.cleanTextArea();
        rb.enterCharacters(user.getNickName());
        rb.enterAt();
        rb.enterCharacters("interia.pl");
        rb.pressTab();
        rb.cleanTextArea();
        rb.enterCharacters(user.getPass());
        rb.pressTab(4);
        rb.pressEnter();
        rb.sleep(3000);


    }
}