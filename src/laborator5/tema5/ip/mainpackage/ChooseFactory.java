package laborator5.tema5.ip.mainpackage;

/**
 * Choose the right factory to use, or return null
 */
public class ChooseFactory {
    public static AbstractFactoryGames factorySelection(String gameFactory) {
        AbstractFactoryGames newFactory = null;//initialize a factory with null
        if (gameFactory.contains("Single")) {
            newFactory = new SinglePlayerGamesFactory();//create a single player factory
        } else if (gameFactory.contains("Multi")) {
            newFactory = new MultiPlayerGamesFactory();//create a multi player factory
        }
        return newFactory;
    }
}
