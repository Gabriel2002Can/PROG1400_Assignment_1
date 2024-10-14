public class Player {
    private String playerName;
    private int numberOfGoals;
    private int numberOfAssists;

    //Constructor method
    public Player (String playerName,int numberOfGoals,int numberOfAssists) {
        this.playerName = playerName;
        this.numberOfGoals = numberOfGoals;
        this.numberOfAssists = numberOfAssists;}

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
}

