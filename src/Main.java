import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Team [] teamArray = new Team[3];
        Player [][] playerArray = new Player[3][3];

        System.out.println("\nFANTASY HOCKEY APPLICATION");

        //Starting team part
        System.out.println("TEAM ENTRY");
        System.out.println("==================================");

        //Starting team input

        //I am thinking about a method to create an instance
        for (int teams = 0; teams < 3; teams++) {
            System.out.println("Enter name for team # " + (teams + 1) + ":");
            Scanner sc = new Scanner(System.in);
            String userInputTeamName = sc.nextLine();

            //Creating new Instance and adding to array
            teamArray[teams] = Team.createInstanceTeam(userInputTeamName);
        }

        System.out.println("\nPLAYER ENTRY");
        System.out.println("==================================");

        for (int teams = 0; teams < teamArray.length; teams++) {
            System.out.println("Enter players for " + teamArray[teams].getTeamName() + ":");

            //Loop for each player
            for (int players = 0; players < 3; players++) {
                System.out.println("Enter name for player # " + (players+1) + ":");
                Scanner sc = new Scanner(System.in);
                String userInputPlayerName = sc.nextLine();

                System.out.println("Enter number of goals for " + userInputPlayerName + ":");
                int userInputPlayerGoal = sc.nextInt();

                System.out.println("Enter number of assists for " + userInputPlayerName + ":");
                int userInputPlayerAssists = sc.nextInt();

                //Updating total team gol/assists
                teamArray[teams].setTeamGoals(teamArray[teams].getTeamGoals() + userInputPlayerGoal);
                teamArray[teams].setTeamAssists(teamArray[teams].getTeamAssists() + userInputPlayerAssists);

                //Instance creation (Variable team referencing the player's team)
                playerArray[teams][players] = Player.createInstancePlayer(userInputPlayerName,userInputPlayerGoal,userInputPlayerAssists,teams);
            }
        }
        System.out.println("\nREPORT: Stats per Team");
        System.out.println("==================================");

        for (int teams = 0; teams < teamArray.length; teams++) {
            String stars = "";
            if ((teamArray[teams].getTeamGoals() + teamArray[teams].getTeamAssists()) > 20) {
                stars = "***";
            } else if ((teamArray[teams].getTeamGoals() + teamArray[teams].getTeamAssists()) > 10) {
                stars = "**";
            } else if ((teamArray[teams].getTeamGoals() + teamArray[teams].getTeamAssists()) > 0) {
                stars = "*";
            }
            System.out.println(teamArray[teams].getTeamName() + ":\t G - " + teamArray[teams].getTeamGoals() + "\t A - " + teamArray[teams].getTeamAssists() + "\t total - " + (teamArray[teams].getTeamAssists() + teamArray[teams].getTeamGoals()) + "\t Budget - $" + teamArray[teams].getTeamBudget());
        System.out.println("Rating: " + stars + " stars");
        }

        //Starting player report
        System.out.println("\nREPORT: Stats per Player");
        System.out.println("==================================");

        for (int teams = 0; teams < teamArray.length; teams++) {
            for (int players = 0; players < playerArray[teams].length; players++) {
                System.out.println(teamArray[teams].getTeamName());

                System.out.println(playerArray[teams][players].getPlayerName() + ":\t G - " + playerArray[teams][players].getNumberOfGoals() + "\t A - " + playerArray[teams][players].getNumberOfAssists() + "\t Total - " + (playerArray[teams][players].getNumberOfGoals() + playerArray[teams][players].getNumberOfAssists()));
            }
        }

    }
}