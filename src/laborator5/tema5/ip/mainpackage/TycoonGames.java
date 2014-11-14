package laborator5.tema5.ip.mainpackage;

/**
 * TycoonGames class implements Games interface
 */
public class TycoonGames implements Games{
    @Override
    public void startPlaying() {
        //game is starting ...
        System.out.println("Tycoon Game is loading...Full Maps and companies are available for you in few seconds");
    }

    @Override
    public void pauseGame() {
        // game is paused
        System.out.println("Hey, be careful! Your cars are in pause too :)");
    }

    @Override
    public void stopPlaying() {
        // game is stopping
        System.out.println("You made an important decision, take care you can be unable to come back!");
    }
}
