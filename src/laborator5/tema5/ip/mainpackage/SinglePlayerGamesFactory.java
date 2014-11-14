package laborator5.tema5.ip.mainpackage;

/**
 * Creating single player games. Two types accepted for this factory.
 */
public class SinglePlayerGamesFactory extends AbstractFactoryGames{
    @Override
    public Games createGame(String gameType) {
        Games singlePlayerGame = null; // initialize a null game
        if(gameType.contains("Tycoon")) {
            singlePlayerGame=new TycoonGames();//create a tycoon game
        } else if (gameType.contains("Doom"))
        {
           singlePlayerGame=new DoomGames();//create a doom game
        }
        return singlePlayerGame;
    }
}
