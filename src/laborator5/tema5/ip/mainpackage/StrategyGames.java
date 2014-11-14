package laborator5.tema5.ip.mainpackage;

/**
 * Strategy Games class is implementing Games interface
 */
public class StrategyGames implements Games{
    @Override
    public void startPlaying() {
        //game is starting
        System.out.println("Prepare your strategy...the game is loading");
    }

    @Override
    public void pauseGame() {
        // game is paused
        System.out.println("You can't made your strategy here, try to unpause the game!");
    }

    @Override
    public void stopPlaying() {
        // game is stopping
        System.out.println("I'm sure you are better now!");
    }
}
