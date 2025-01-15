
package src;
import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    FortuneTeller fortuneTeller = new FortuneTeller();

    private static final int CHOICE_GET_A_PERSONALIZED_FORTUNE  = 1;
    private static final int CHOICE_SELECT_A_FORTUNE_TELLER = 2;
    private static final int CHOICE_QUIT = 3;

        public void selectChoice() {
            //while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICE_GET_A_PERSONALIZED_FORTUNE:
                    System.out.println("You selected a personalized fortune.");
                    fortuneTeller.getAPersonalizedFortune();
                    break;
                case CHOICE_SELECT_A_FORTUNE_TELLER:
                    System.out.println("You would like a fortune teller to give you a fortune. ");
                    fortuneTeller.selectTeller();
                    break;
                case CHOICE_QUIT:
                    System.out.println("Thank you for visiting. Please come back soon to get a fortune.");
                    break; //return;
            }
        //}

    }

   /* public MainMenu(Scanner scanner, String userName, String color, ArrayList<String> personalFortune) {
        this.scanner = scanner;
        this.userName = userName;
        Color = color;
        this.personalFortune = personalFortune;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
*/
    public void printMainMenu() {
        System.out.println("Welcome to Mystic \nThe Fortune Telling App\n");
        System.out.println("--- Main Menu ---");
        System.out.println(CHOICE_GET_A_PERSONALIZED_FORTUNE + ". Get a personalized fortune");
        System.out.println(CHOICE_SELECT_A_FORTUNE_TELLER + ". Select a fortune teller");
        System.out.println(CHOICE_QUIT + ". Quit");
        System.out.println("> ");
        selectChoice();
    }
}

