import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Team [] teamArray = new Team[3];
        Player [] playerArray = new Player[3];

        System.out.println("FANTASY HOCKEY APPLICATION");

        //Starting team part
        System.out.println("TEAM ENTRY\n");
        System.out.println("==================================");

        //Starting team input
        for (int teams = 1; teams < 4; teams++) {
            System.out.println("Enter name for team # " + teams + ":\n");
            Scanner sc = new Scanner(System.in);
            String userInputTeamName = sc.nextLine();

        }

    }
}