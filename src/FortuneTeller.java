package src;

import java.util.Scanner;

public class FortuneTeller {

    String fortuneTellerName;
    String fortuneTellerMessage;

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
    }

}
