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

        //I am thinking about a method to create an instance
        for (int teams = 0; teams < 3; teams++) {
            System.out.println("Enter name for team # " + (teams + 1) + ":\n");
            Scanner sc = new Scanner(System.in);
            String userInputTeamName = sc.nextLine();

            //Creating new Instance and adding to array
            teamArray[teams] = Team.createInstanceTeam(userInputTeamName);
        }

        System.out.println("PLAYER ENTRY\n");

    }
}