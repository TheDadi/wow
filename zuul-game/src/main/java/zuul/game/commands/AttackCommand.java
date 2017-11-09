package zuul.game.commands;

import core.zuul.CommandType;
import org.newdawn.slick.command.BasicCommand;

/**
 * Created by difad on 19.10.2017.
 */
public class AttackCommand extends BasicCommand {

    public AttackCommand() {
        super(CommandType.ATTACK.name());
    }
}
