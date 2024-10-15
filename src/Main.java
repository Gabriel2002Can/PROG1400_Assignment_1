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
        System.out.println("==================================");

        for (int teams = 0; teams < teamArray.length; teams++) {
            System.out.println("Enter players for " + teamArray[teams].getTeamName() + ":\n");

            //Loop for each player
            for (int players = 0; players < 3; players++) {
                System.out.println("Enter name for player # " + (players+1) + ":\n");
                Scanner sc = new Scanner(System.in);
                String userInputPlayerName = sc.nextLine();

                System.out.println("Enter number of goals for " + userInputPlayerName + ":\n");
                int userInputPlayerGoal = sc.nextInt();

                System.out.println("Enter number of assists for " + userInputPlayerName + ":\n");
                int userInputPlayerAssists = sc.nextInt();

                //Instance creation (Variable team referencing the player's team)
                playerArray[players] = Player.createInstancePlayer(userInputPlayerName,userInputPlayerGoal,userInputPlayerAssists,teams);
            }
        }
        System.out.println("REPORT: Stats per Team\n");
        System.out.println("==================================\n");
    }
}