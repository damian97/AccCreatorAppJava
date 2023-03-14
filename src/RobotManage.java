import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

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

   public void sleep(int ms) {
      try {
         Thread.sleep(ms);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
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

   public void enterAt() {
      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.delay(50);
      robot.keyPress(KeyEvent.VK_2);
      robot.delay(50);
      robot.keyRelease(KeyEvent.VK_SHIFT);
      robot.delay(50);
      robot.keyRelease(KeyEvent.VK_2);
      robot.delay(150);
   }

   public void pressEnter() {
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
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


   public void cleanTextArea() {
//      robot.keyPress(KeyEvent.VK_CONTROL);
//      robot.delay(50);
//      robot.keyPress(KeyEvent.VK_A);
//      robot.delay(50);
//      robot.keyRelease(KeyEvent.VK_CONTROL);
//      robot.delay(50);
//      robot.keyRelease(KeyEvent.VK_A);
//      robot.delay(50);
      robot.keyPress(KeyEvent.VK_BACK_SPACE);
      robot.delay(3050);
      robot.keyRelease(KeyEvent.VK_BACK_SPACE);
      robot.delay(500);
   }


   public void closeCard() {
      robot.delay(5000);
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.delay(50);
      robot.keyPress(KeyEvent.VK_W);
      robot.delay(50);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.delay(50);
      robot.keyRelease(KeyEvent.VK_W);
      robot.delay(150);
   }


   public void searchColors(Color color, Color color2) {
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      int screenWidth = screenSize.width;
      int screenHeight = screenSize.height;

      robot.setAutoDelay(0);


      int x = screenWidth/2, y = screenHeight/4;

      for (; y < screenHeight; y += 5) {
         Color tmpColor = robot.getPixelColor(x, y);
         if (tmpColor.equals(color)) {
            robot.mouseMove(x, y);
            robot.delay(500);
            tmpColor = robot.getPixelColor(x, y);
            if (tmpColor.equals(color2)) {
               robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
               robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
               break;
            } else {
               System.out.println("Nie znaleziono");
            }
         }
      }

      robot.setAutoDelay(10);


   }

   public void searchColors(Color black) {
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      int screenWidth = screenSize.width;
      int screenHeight = screenSize.height;

      robot.setAutoDelay(0);


      int x = screenWidth/2, y = screenHeight/4;

      for (; y < screenHeight; y += 5) {
         Color tmpColor = robot.getPixelColor(x, y);
         if (tmpColor.equals(black)) {
            robot.mouseMove(x, y);
            robot.delay(500);
            tmpColor = robot.getPixelColor(x, y);
         }
      }

      robot.setAutoDelay(10);

   }


}
