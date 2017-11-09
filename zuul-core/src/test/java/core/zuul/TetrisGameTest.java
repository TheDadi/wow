package core.zuul;

import org.junit.Before;
import org.junit.Test;

public class TetrisGameTest {

    private ZuulGame zuulGame;

    @Before
    public void before() {
        zuulGame = new ZuulGame();
    }

    @Test
    public void playAGame() {

        zuulGame.startGame();
    }
}
