package src;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    /*ConsoleIO io;
    Scanner scanner = new Scanner(System.in);
    String userName;
    String Color;
    ArrayList<String> personalFortune = new ArrayList<>();
*/
    private static final int CHOICE_GET_A_PERSONALIZED_FORTUNE  = 1;
    private static final int CHOICE_SELECT_A_FORTUNE_TELLER = 2;
    private static final int CHOICE_QUIT = 3;


    /*public MainMenu(ConsoleIO io, Scanner scanner, String userName, String color, ArrayList<String> personalFortune) {
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

    public ArrayList<String> getPersonalFortune() {
        return personalFortune;
    }

    public void setPersonalFortune(ArrayList<String> personalFortune) {
        this.personalFortune = personalFortune;
    }
*/
    public void printMainMenu() {
        System.out.println("--- Main Menu ---");

        //io.writeMessage();

        System.out.println(CHOICE_GET_A_PERSONALIZED_FORTUNE + ". Get a personalized fortune");
        System.out.println(CHOICE_SELECT_A_FORTUNE_TELLER + ". Select a fortune teller");
        System.out.println(CHOICE_QUIT + ". Quit");

    }
}
