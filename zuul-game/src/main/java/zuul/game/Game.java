package zuul.game;



import core.zuul.character.Direction;
import core.zuul.ZuulGame;
import core.zuul.character.CharacterType;
import org.newdawn.slick.*;
import org.newdawn.slick.command.Command;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.InputProviderListener;
import org.newdawn.slick.command.KeyControl;

import java.util.HashMap;
import java.util.Map;

public class Game extends BasicGame {

    private static final String GAME_NAME = "World of zuul";
    private static final int WIDTH = 700;
    private static final int HEIGHT = 700;

    private static final int FIXED_X_OFFSET = 30;
    private static final int FIXED_Y_OFFSET = 40;

    private static final Command LEFT = new DirectionCommand(Direction.LEFT);
    private static final Command RIGHT = new DirectionCommand(Direction.RIGHT);
    private static final Command UP = new DirectionCommand(Direction.UP);
    private static final Command DOWN = new DirectionCommand(Direction.DOWN);
    private static final Command ATTACK = new AttackCommand();

    private final ZuulGame zuulGame;
    private final Map<CharacterType, Image> characterTypeImageMap;

    public Game() {
        super(GAME_NAME);
        zuulGame = new ZuulGame();
        characterTypeImageMap = new HashMap<>();
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        buildPieceTypeToImageMap();
        zuulGame.startGame();

        InputProvider provider = new InputProvider(container.getInput());
        provider.addListener(new InputProviderListener() {
            @Override
            public void controlPressed(Command command) {
                if (command instanceof DirectionCommand) {
                    DirectionCommand zuulCommand = (DirectionCommand) command;
                    zuulGame.movePiece(zuulCommand.getDirection());
                }
            }

            @Override
            public void controlReleased(Command command) {
            }
        });

        provider.bindCommand(new KeyControl(Input.KEY_A), LEFT);
        provider.bindCommand(new KeyControl(Input.KEY_F), RIGHT);
        provider.bindCommand(new KeyControl(Input.KEY_S), DOWN);
        provider.bindCommand(new KeyControl(Input.KEY_W), UP);
        provider.bindCommand(new KeyControl(Input.KEY_SPACE), ATTACK);
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        drawBoard(g, zuulGame);
    }

    private void drawBoard(Graphics graphics, ZuulGame zuulGame) {
        Image sampleImage = characterTypeImageMap.get(CharacterType.PLAYER);
        graphics.drawRect(FIXED_X_OFFSET,
                FIXED_Y_OFFSET,
                zuulGame.getX() * sampleImage.getWidth(),
                zuulGame.getY() * sampleImage.getHeight());

        for (int x = 0; x < zuulGame.getX(); x++) {
            for (int y = 0; y < zuulGame.getY(); y++) {
                CharacterType pieceAt = zuulGame.getPieceAt(x, y);
                if (pieceAt != null) {
                    Image image = characterTypeImageMap.get(pieceAt);
                    int xPosition = x * image.getWidth();
                    int yPosition = y * image.getHeight();
                    graphics.drawImage(image,
                            xPosition + FIXED_X_OFFSET,
                            yPosition + FIXED_Y_OFFSET);
                }
            }
        }

        String score = String.format("Score:%d", zuulGame.getScore());
        graphics.drawString(score, FIXED_X_OFFSET, FIXED_Y_OFFSET);
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        zuulGame.tick();
    }

    private void buildPieceTypeToImageMap() throws SlickException {
        characterTypeImageMap.put(CharacterType.PLAYER, new Image("images/player.gif"));
        characterTypeImageMap.put(CharacterType.MONSTER, new Image("images/monster.gif"));
        characterTypeImageMap.put(CharacterType.NPC, new Image("images/npc.gif"));
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new Game());
        app.setDisplayMode(WIDTH, HEIGHT, false);
        app.setForceExit(false);
        app.start();
    }
}
