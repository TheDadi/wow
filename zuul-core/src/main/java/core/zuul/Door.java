package core.zuul;

import java.awt.Point;

/**
 * Created by difad on 12.10.2017.
 */
public class Door {
    private Point position;
    private boolean isLocked;

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
}
