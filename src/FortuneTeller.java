
package src;
import java.util.Scanner;

public class FortuneTeller {

    String fortuneTellerName;
    String fortuneTellerMessage;
    //color constants go here
    private static final int CHOICE_BLUE  = 1;
    private static final int CHOICE_PINK = 2;
    private static final int CHOICE_YELLOW = 3;
    private static final int CHOICE_GREEN = 4;
    //Teller constants go here
    private static final int TELLER_STARBLOOM  = 1;
    private static final int TELLER_FIREWALKER = 2;
    private static final int TELLER_MOONWATER = 3;

    public FortuneTeller() {
        this.fortuneTellerName = fortuneTellerName;
        this.fortuneTellerMessage = fortuneTellerMessage;
    }

    public String getFortuneTellerName() {
        return fortuneTellerName;
    }

    public void setFortuneTellerName(String fortuneTellerName) {
        this.fortuneTellerName = fortuneTellerName;
    }

    public String getFortuneTellerMessage() {
        return fortuneTellerMessage;
    }

    public void setFortuneTellerMessage(String fortuneTellerMessage) {
        this.fortuneTellerMessage = fortuneTellerMessage;
    }

    public void fortuneTeller() {
        //print fortunes
    }

    public void getAPersonalizedFortune() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello " + username + "!");
        System.out.println("Please select the color you like the most: ");
        //print color choices here
        System.out.println(CHOICE_BLUE + " Blue");
        System.out.println(CHOICE_PINK + " Pink");
        System.out.println(CHOICE_YELLOW + " Yellow");
        System.out.println(CHOICE_GREEN + " Green");
        //color switch here
        int choice = scanner.nextInt();
        switch (choice) {
            case CHOICE_BLUE:
                System.out.println("An unexpected relationship will become permanent.");
                break;
            case CHOICE_PINK:
                System.out.println("You will soon embark on a fabulous journey.");
                break;
            case CHOICE_YELLOW:
                System.out.println("Your kindness will lead you to success.");
                break;
            case CHOICE_GREEN:
                System.out.println("Your sense of humor will light up someone's day.");
                break;
        }
    }

    public void selectTeller() {
        System.out.println("Select a fortune teller from the following list: ");
        Scanner scanner = new Scanner(System.in);
        //switch for teller goes here
        System.out.println(TELLER_STARBLOOM + " Starbloom");
        System.out.println(TELLER_FIREWALKER + " Firewalker");
        System.out.println(TELLER_MOONWATER + " Moonwater");
        int choice = scanner.nextInt();
        switch (choice) {
            case TELLER_STARBLOOM:
                System.out.println("Happiness is in your future... especially if you remember where you hid that last piece of chocolate.");
                break;
            case TELLER_FIREWALKER:
                System.out.println("Happiness begins with facing life with a smile and a wink.");
                break;
            case TELLER_MOONWATER:
                System.out.println("Your life will be filled with sunshine and rainbows... and the occasional thunderstorm.");
                break;
        }
    }
}
