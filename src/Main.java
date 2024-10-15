import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaring both object arrays
        Team [] teamArray = new Team[3];

        //2d array for organizing players with their respective teams
        Player [][] playerArray = new Player[3][3];

        System.out.println("\nFANTASY HOCKEY APPLICATION");

        //Starting team part
        System.out.println("TEAM ENTRY");
        System.out.println("==================================");

        //Starting team input

        //Instantiating teams
        for (int teams = 0; teams < 3; teams++) {
            System.out.println("Enter name for team # " + (teams + 1) + ":");
            Scanner sc = new Scanner(System.in);
            String userInputTeamName = sc.nextLine();

            //Creating new Instance and adding to array
            teamArray[teams] = Team.createInstanceTeam(userInputTeamName);
        }

        System.out.println("\nPLAYER ENTRY");
        System.out.println("==================================");

        //Instantiating players
        for (int teams = 0; teams < teamArray.length; teams++) {
            System.out.println("\nEnter players for " + teamArray[teams].getTeamName() + ":");

            //Loop each player
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

        //Starting reporting
        System.out.println("\nREPORT: Stats per Team");
        System.out.println("==================================");

        //Will loop through each team, getting their report
        for (int teams = 0; teams < teamArray.length; teams++) {

            //Stars setting
            String stars = "";
            if ((teamArray[teams].getTeamGoals() + teamArray[teams].getTeamAssists()) > 20) {
                stars = "***";
            } else if ((teamArray[teams].getTeamGoals() + teamArray[teams].getTeamAssists()) > 10) {
                stars = "**";
            } else if ((teamArray[teams].getTeamGoals() + teamArray[teams].getTeamAssists()) > 0) {
                stars = "*";
            }
            System.out.println(teamArray[teams].showReportTeam());
        System.out.println("Rating: " + stars + " stars");
        }

        //Starting player report
        System.out.println("\nREPORT: Stats per Player");
        System.out.println("==================================");

        //Will loop through each player, getting their report
        for (int teams = 0; teams < teamArray.length; teams++) {
            for (int players = 0; players < playerArray[teams].length; players++) {
                System.out.println(teamArray[teams].getTeamName());

                System.out.println(playerArray[teams][players].showReportPlayer());
            }
        }
    }
}