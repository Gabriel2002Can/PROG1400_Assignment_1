public class Team {
    private String teamName;
    private double teamBudget;

    private int teamGoals;
    private int teamAssists;

    //Constructor method
    public Team (String teamName) {
        this.teamName = teamName;
        this.teamGoals = 0;
        this.teamAssists = 0;

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

    public int getTeamGoals() {
        return teamGoals;
    }

    public void setTeamGoals(int teamGoals) {
        this.teamGoals = teamGoals;
    }

    public int getTeamAssists() {
        return teamAssists;
    }

    public void setTeamAssists(int teamAssists) {
        this.teamAssists = teamAssists;
    }

    //Instantiating method
    public static Team createInstanceTeam(String name) {
        return new Team(name);
    }
}
