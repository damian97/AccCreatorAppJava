public class Main {
    public static void main(String[] args) {

        System.out.println("Test programu w Klasie Robot");
        System.out.println();
        System.out.println("Bez zewnetrznych bibliotek");
        System.out.println();
        System.out.println("Trzeba zrobić Jara i GUI, chociaz to moze dzialac z konsoli");
        System.out.println();
        System.out.println("Dodanie troche znakow");

            // Ciekawy zbior zadanek z Programowania
        //
        //   http://aragorn.pb.bialystok.pl/~ania/Dzienne/podst_prog/zbior_zadan_PP.pdf
        //


        /*


        Miejsce na uruchomienie menu badz GUI


         */


        Interia interia = new Interia();
        RobotManage rb = new RobotManage();

        interia.openDefaultBrowser();
        interia.eneterRegDetail();
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