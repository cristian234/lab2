package laborator5.tema5.ip.mainpackage;

/**
 * Implementing Abstract Factory class for creating one of the five types of the Games.
 */
public abstract class AbstractFactoryGames {
   public abstract Games createGame(String gameType);// gameType="Football" or gameType="Shoot" or gameType="Strategy" or gameType="Tycoon" or gameType="Doom"
}
