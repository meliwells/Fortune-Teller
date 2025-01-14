package src;

public class App {
    public static void main(String[] args) {
        ConsoleIO io = new ConsoleIO();

        MainMenu mainMenu = new MainMenu();  //create object to call method
        mainMenu.printMainMenu(); //printMainMenu is method being called from MainMenu
    }
}
