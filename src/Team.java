public class Team {
    private String teamName;
    private double teamBudget;

    private int teamGoals;
    private int teamAssists;

    //Constructor method
    public Team (String teamName) {

        //Used as reference https://stackoverflow.com/questions/6942624/how-can-i-throw-a-general-exception-in-java
        if (teamName.length() < 3){throw new IllegalArgumentException("The name should be at least 3 characters long!");}

        this.teamName = teamName;
        this.teamGoals = 0;
        this.teamAssists = 0;

        //Reference https://www.w3schools.com/java/java_howto_random_number.asp
        this.teamBudget = (double) ((int) (Math.random() * 10000001)) /100;}

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

    public String showReportTeam() {

        //Will return a string with all the information
        return this.getTeamName() + ":\t G - " + this.getTeamGoals() + "\t A - " + this.getTeamAssists() + "\t total - " + (this.getTeamAssists() + this.getTeamGoals()) + "\t Budget - $" + this.getTeamBudget();
    }
}
