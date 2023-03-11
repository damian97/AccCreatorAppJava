import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotManage {

   private Robot robot;

   {
      try {
         robot = new Robot();
         robot.setAutoDelay(10);
      } catch (AWTException e) {
         throw new RuntimeException(e);
      }
   }

   public void enterCharacters(String string) {
      for (int i = 0; i < string.length(); i++) {
         char tmpChar = string.charAt(i);

         robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(tmpChar));
         robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(tmpChar));
      }

   }

   public void pressTab() {
      robot.keyPress(KeyEvent.VK_TAB);
      robot.keyRelease(KeyEvent.VK_TAB);
   }


}
