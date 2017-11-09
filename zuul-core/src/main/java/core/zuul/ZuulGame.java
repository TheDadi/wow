package core.zuul;

import core.zuul.character.CharacterType;
import core.zuul.character.Direction;
import org.newdawn.slick.*;

public class ZuulGame extends BasicGame{

    private static final String GAME_NAME = "World of Zuul [ZHAW edition]";

    public ZuulGame() {
        super(GAME_NAME);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }

    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new ZuulGame());
            app.setDisplayMode(500, 500, false);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
}
