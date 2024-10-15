public class Player {
    private String playerName;
    private int numberOfGoals;
    private int numberOfAssists;
    private int playerTeam;

    //Constructor method
    public Player (String playerName,int numberOfGoals,int numberOfAssists, int playerTeam) {

        //Used as reference https://stackoverflow.com/questions/6942624/how-can-i-throw-a-general-exception-in-java
        if (playerName.length() < 3){throw new IllegalArgumentException("The name should be at least 3 characters long!");}
        if (numberOfGoals < 0 || numberOfAssists < 0){throw new IllegalArgumentException("The numbers should be above 0!");}

        this.playerName = playerName;
        this.numberOfGoals = numberOfGoals;
        this.numberOfAssists = numberOfAssists;
        this.playerTeam = playerTeam;}

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfAssists() {
        return numberOfAssists;
    }

    public void setNumberOfAssists(int numberOfAssists) {
        this.numberOfAssists = numberOfAssists;
    }

    public void setPlayerTeam(int playerTeam) {
        this.playerTeam = playerTeam;
    }

    public int getPlayerTeam() {
        return playerTeam;
    }

    public static Player createInstancePlayer(String name, int goals, int assists, int team){
        return new Player(name , goals , assists, team);
    }

    public String showReportPlayer() {
        return this.getPlayerName() + ":\t G - " + this.getNumberOfGoals() + "\t A - " + this.getNumberOfAssists() + "\t Total - " + (this.getNumberOfGoals() + this.getNumberOfAssists());
    }
}

