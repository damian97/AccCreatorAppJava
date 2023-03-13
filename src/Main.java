public class Main {



    public static void main(String[] args) {


        String urlInteriaReg = "https://konto-pocztowe.interia.pl/#/nowe-konto/darmowe";


        System.out.println("Test programu w Klasie Robot");
        System.out.println();
        System.out.println("Bez zewnetrznych bibliotek");
        System.out.println();
        System.out.println("Trzeba zrobić Jara i GUI, chociaz to moze dzialac z konsoli");
        System.out.println();
        System.out.println("Dodanie troche znakow");


        Interia interia = new Interia(urlInteriaReg);
        RobotManage rb = new RobotManage();

        rb.eneterRegDetail();
        rb.enterCharacters("Damian");
        rb.pressTab();
        rb.enterCharacters("Sluszniak");
        rb.pressTab();
        rb.enterCharacters("12");
        rb.pressTab();
        rb.pressTab();
        rb.enterCharacters("1997");
        rb.pressTab();
        rb.pressTab();
        rb.enterCharacters("sadasdsacsc3423");


    }
}