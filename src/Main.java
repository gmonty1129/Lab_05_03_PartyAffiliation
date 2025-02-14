import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        System.out.println("[D-Democrat, R-Republican, I-Independent, O-Other]\nPlease enter your party affiliation");
        menuChoice = in.nextLine();
        if(menuChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You chose a Democratic Donkey!");
        }
        else if (menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You chose a Republican Elephant!");
        }
        else if (menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You chose an Independent Person!");
        }
        else if (menuChoice.equalsIgnoreCase("O"))
        {
            System.out.println("You chose Other!");
        }
        else
            System.out.println("Invalid selection: " + menuChoice);
            System.exit(0);
    }
}