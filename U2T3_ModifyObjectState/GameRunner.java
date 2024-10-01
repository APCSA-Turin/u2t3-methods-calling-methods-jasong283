package U2T3_ModifyObjectState;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Volleyball", 12);

        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Players benched: " + game.getPlayersBenched());
        System.out.println("Score: " + game.getScore());
        System.out.println("Game is over: " +  game.isGameOver());

        System.out.println("");
        System.out.println("4 players are injured.");
        System.out.println("");

        game.removePlayer();
        game.removePlayer();
        game.increaseScore(15);

        System.out.println("Game name " + game.getGameName());
        System.out.println("Players " + game.getPlayers());
        System.out.println("Players benched: " + game.getPlayersBenched());
        System.out.println("Score " + game.getScore());
        System.out.println("Game is over: " + game.isGameOver());

        

    }
}
