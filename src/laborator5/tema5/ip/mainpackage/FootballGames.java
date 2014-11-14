package laborator5.tema5.ip.mainpackage;

/**
 * Football Games is implemented
 */
public class FootballGames implements Games{
    @Override
    public void startPlaying() {
        //we are starting the game...
        System.out.println("Football Game is loading...Please Wait");
    }

    @Override
    public void pauseGame() {
        // oh no, somebody paused the game!
        System.out.println("You paused the Football game...C.Ronaldo is waiting on the field");
    }

    @Override
    public void stopPlaying() {
        // "closing" the game...Bye!
        System.out.println("Don't worry!Next time you will win!");
    }
}
