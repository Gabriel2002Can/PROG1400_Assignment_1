public class Team {
    private String teamName;
    private double teamBudget;

    private static int teamGoals;
    private static int teamAssists;

    //Constructor method
    public Team (String teamName,double teamBudget) {
        this.teamName = teamName;

        //Reference https://www.w3schools.com/java/java_howto_random_number.asp
        this.teamBudget = (double) ((int) (Math.random() * 1000001)) /100;}

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getTeamBudget() {
        return teamBudget;
    }

    public void setTeamBudget(double teamBudget) {
        this.teamBudget = teamBudget;
    }

    public static int getTeamGoals() {
        return teamGoals;
    }

    public static void setTeamGoals(int teamGoals) {
        Team.teamGoals = teamGoals;
    }

    public static int getTeamAssists() {
        return teamAssists;
    }

    public static void setTeamAssists(int teamAssists) {
        Team.teamAssists = teamAssists;
    }
}
