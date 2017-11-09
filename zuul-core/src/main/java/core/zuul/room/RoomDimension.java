package core.zuul.room;

/**
 * Created by difad on 12.10.2017.
 */
public class RoomDimension {
    private int length;
    private int width;

    public RoomDimension() {
    }

    public RoomDimension(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
