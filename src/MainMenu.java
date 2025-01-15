package src;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    String username;
/*
    String Color;
    ArrayList<String> personalFortune = new ArrayList<>();
*/
    private static final int CHOICE_GET_A_PERSONALIZED_FORTUNE  = 1;
    private static final int CHOICE_SELECT_A_FORTUNE_TELLER = 2;
    private static final int CHOICE_QUIT = 3;
    private static final FortuneTeller [] fortuneTeller = new FortuneTeller[3];
    private static final ColorChoice [] colorChoice = new ColorChoice[4];


        public void selectChoice() {
            //while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICE_GET_A_PERSONALIZED_FORTUNE:
                    System.out.println("You selected a personalized fortune.");
                    getAPersonalizedFortune();
                    break;
                case CHOICE_SELECT_A_FORTUNE_TELLER:
                    System.out.println("You would like a fortune-teller to give you a fortune. ");
                    selectAFortuneTeller();
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


        System.out.println(CHOICE_GET_A_PERSONALIZED_FORTUNE + ". Get a personalized fortune");
        System.out.println(CHOICE_SELECT_A_FORTUNE_TELLER + ". Select a fortune teller");
        System.out.println(CHOICE_QUIT + ". Quit");
        System.out.println("> ");
        selectChoice();
    }

    public void getAPersonalizedFortune() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello " + username + "!");
        System.out.println("Please select the color you like the most: ");

        /*Prints out Hello "name" Then asks to pick a color out of the following: Blue, Pink, Yellow, Green.
                Color chosen will provide a fortune:
        Blue:   "An unexpected relationship will become permanent."
        Pink:   "You will soon embark on a fabulous journey."
        Yellow: "Your kindness will lead you to success."
        Green:  "Your sense of humor will light up someone's day."
        After fortune given,exits the program with a thank you for playing message. */
    }

    public void selectAFortuneTeller() {
            System.out.println("Select a fortune-teller from the following list: ");


    /*
    fortuneTeller[0] = new FortuneTeller ("Starbloom", "Happiness is in your future... especially if you remember where you hid that last piece of chocolate." );
    fortuneTeller[1] = new FortuneTeller ("Firewalker", "Happiness begins with facing life with a smile and a wink." );
    fortuneTeller[2] = new FortuneTeller ("Moonwater", "Your life will be filled with sunshine and rainbows... and the occasional thunderstorm.");
    */

        }

}
