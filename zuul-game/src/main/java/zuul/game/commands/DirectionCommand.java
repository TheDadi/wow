package zuul.game.commands;

import core.zuul.character.Direction;
import org.newdawn.slick.command.BasicCommand;

public class DirectionCommand extends BasicCommand {

    private final Direction direction;

    public DirectionCommand(Direction direction) {
        super(direction.name());
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
