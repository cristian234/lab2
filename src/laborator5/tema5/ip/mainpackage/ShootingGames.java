package laborator5.tema5.ip.mainpackage;

/**
 * Shooting Games is implementing Games interface.
 */
public class ShootingGames implements Games{
    @Override
    public void startPlaying() {
        //game is starting
        System.out.println("Load your gun, while i'm loading your game");
    }

    @Override
    public void pauseGame() {
        // game is paused
        System.out.println("This pause doesn't get you immunity, so go on!");
    }

    @Override
    public void stopPlaying() {
        // game is stopping
        System.out.println("Let me guess! You lose!");
    }
}
