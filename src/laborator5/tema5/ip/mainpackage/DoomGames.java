package laborator5.tema5.ip.mainpackage;

/**
 * DoomGames class implements Games interface and expects some scarry games :D
 */
public class DoomGames implements Games{
    @Override
    public void startPlaying() {
        //we are starting the game...
        System.out.println("Doom is loading monsters for you...Please Wait");
    }

    @Override
    public void pauseGame() {
        // game pause function
        System.out.println("You paused Doom...Are you scared?");
    }

    @Override
    public void stopPlaying() {
        // game stop function
        System.out.println("Come back, soon!");
    }
}
