package laborator5.tema5.ip.mainpackage;

/**
 * Create the multiplayer factory and selects the class type to create. Three types are accepted here!
 */
public class MultiPlayerGamesFactory extends AbstractFactoryGames{
    @Override
    public Games createGame(String gameType) {
        Games multiPlayerGame=null; // initialize game with null
        if(gameType.contains("Football"))
        {
            multiPlayerGame=new FootballGames();//create football game
        } else if(gameType.contains("Shoot"))
        {
            multiPlayerGame=new ShootingGames();//create shooting game
        }   else if(gameType.contains("Strategy"))
        {
            multiPlayerGame=new StrategyGames();//create strategy game
        }
        return multiPlayerGame;
    }
}
