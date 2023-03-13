import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotManage {

   private Robot robot;
   private int delaySpeed;

   public RobotManage() {
      this.delaySpeed = 30;
      try {
         robot = new Robot();
         robot.setAutoDelay(delaySpeed);
      } catch (AWTException e) {
         throw new RuntimeException(e);
      }

   }



   public int getDelaySpeed() {
      return delaySpeed;
   }

   public void setDelaySpeed(int delaySpeed) {
      this.delaySpeed = delaySpeed;
      robot.setAutoDelay(delaySpeed);
   }



   public void eneterRegDetail() {

      robot.delay(3000);

      for (int i = 0; i < 3; i++) {
         robot.keyPress(KeyEvent.VK_TAB);
         robot.keyRelease(KeyEvent.VK_TAB);
      }


   }


   public void enterCharacters(String string) {
      for (int i = 0; i < string.length(); i++) {
         char tmpChar = string.charAt(i);
         if (tmpChar >= 65 && tmpChar <= 90) {
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(tmpChar));
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(tmpChar));
         } else {
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(tmpChar));
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(tmpChar));
         }
      }

   }


   public void enterOptionPane(int value) {
      for (int i = 0; i < value; i++) {
         robot.keyPress(KeyEvent.VK_DOWN);
         robot.keyRelease(KeyEvent.VK_DOWN);
      }
      robot.delay(500);
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
      robot.delay(500);
   }

   public void pressTab() {
      robot.keyPress(KeyEvent.VK_TAB);
      robot.keyRelease(KeyEvent.VK_TAB);
   }

   public void pressTab(int numbersOfTab) {
      for (int i = 0; i < numbersOfTab; i++) {
         robot.keyPress(KeyEvent.VK_TAB);
         robot.keyRelease(KeyEvent.VK_TAB);
      }
   }


   public void searchColor(Color color) {
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      int screenWidth = screenSize.width + 1000;
      int screenHeight = screenSize.height;

      robot.setAutoDelay(0);


      int x = 0, y = 0;
      while (x < screenWidth) {
         y += 20;

         if (robot.getPixelColor(x, y).equals(color)) {
            robot.mouseMove(x, y);
            robot.setAutoDelay(getDelaySpeed());
            break;
         }

         if (y >= screenHeight) {
            y = 0;
            x += 25;
         }

         robot.mouseMove(x, y);
      }

   }


}
