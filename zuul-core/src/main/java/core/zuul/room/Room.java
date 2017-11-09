package core.zuul.room;

import com.difazdar.ch.Door;
import com.difazdar.ch.item.Item;
import com.difazdar.ch.obstacle.Obstacle;

import java.util.List;

/**
 * Created by difad on 12.10.2017.
 */
public class Room {
    private String name;
    private String description;
    private RoomDimension dimensions;
    private List<Item> items;
    private List<Character> characters;
    private List<Obstacle> obstacles;
    private List<Door> doors;

    public RoomDimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(RoomDimension dimensions) {
        this.dimensions = dimensions;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    public void setObstacles(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
