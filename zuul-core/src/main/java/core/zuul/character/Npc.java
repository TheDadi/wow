package core.zuul.character;

import java.util.List;

/**
 * Created by difad on 12.10.2017.
 */
public class Npc extends Character{
    private List<String> punchlines;

    public List<String> getPunchlines() {
        return punchlines;
    }

    public void setPunchlines(List<String> punchlines) {
        this.punchlines = punchlines;
    }
}
