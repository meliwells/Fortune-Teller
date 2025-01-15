package src;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    String userName;
    Scanner scanner = new Scanner(System.in);
/*
    String Color;
    ArrayList<String> personalFortune = new ArrayList<>();
*/
    private static final int CHOICE_GET_A_PERSONALIZED_FORTUNE  = 1;
    private static final int CHOICE_SELECT_A_FORTUNE_TELLER = 2;
    private static final int CHOICE_QUIT = 3;

//loop
   public void selectChoice() {
       int choice = scanner.nextInt();
        switch (choice) {
            case CHOICE_GET_A_PERSONALIZED_FORTUNE:
                System.out.println("You selected a personalized fortune.");
                //getAPersonalizedFortune()
                break;
            case CHOICE_SELECT_A_FORTUNE_TELLER:
                System.out.println("You would like to select a fortune-teller to give you a fortune. ");
                break;
            case CHOICE_QUIT:
                System.out.println("Thank you for visiting. Please come back soon to get a fortune.");
                break; //return
        }
    }


   /* public MainMenu(ConsoleIO io, Scanner scanner, String userName, String color, ArrayList<String> personalFortune) {
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
        System.out.println("Welcome to Mystic \nThe Fortune Telling App\n");
        System.out.println("--- Main Menu ---");

        //io.writeMessage();

        System.out.println(CHOICE_GET_A_PERSONALIZED_FORTUNE + ". Get a personalized fortune");
        System.out.println(CHOICE_SELECT_A_FORTUNE_TELLER + ". Select a fortune teller");
        System.out.println(CHOICE_QUIT + ". Quit");
        System.out.println("> ");


        selectChoice();
    }

    public void getAPersonalizedFortune() {
            System.out.println("Enter your name: ");
            System.out.println("Hello " + userName);

        /*Prints out Hello "name" Then asks to pick a color out of the following: Blue, Pink, Yellow, Green.
                Color chosen will provide a fortune:
        Blue:   1. "fortune"
        Pink:   2. "fortune"
        Yellow: 3. "fortune"
        Green:  4. "fortune"
        After fortune given,exits the program with a thank you for playing message. */

    //method for selectAFortuneTeller()

    }
}
