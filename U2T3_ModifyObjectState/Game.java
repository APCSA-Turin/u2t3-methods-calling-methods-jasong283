package U2T3_ModifyObjectState;

public class Game {
    private String gameName;
    private int players;
    private int totalPlayers;
    private int score;
    private double averageScore;

    public Game(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
        totalPlayers = 14;
        score = 0;
    }

    public String getGameName() {
        return gameName;
    }

    public int getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

    public void addPlayer() {
        players++;
    }

    public void increaseScore(int increase) {
        score = score + increase;
    }

    public double averageScorePerPlayer() {
        return averageScore = (double) score / players;
    }

    public boolean isGameOver() {
        if(score > 9) {
            return true;
        }   else {
            return false;
        }

    }

    public void removePlayer() {
        players--;
    }

    public int getPlayersBenched() {
        return totalPlayers - players;
    }


}


