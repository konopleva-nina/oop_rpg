package AllHero;

import java.util.ArrayList;

public class Robber extends Melee{
    public Robber(int x, int y, int initiative) {
        super (x, y, initiative + 4, 5, 2, 2, 1);
    }

    @Override
    public String getInfo() {
        return "Robber [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }
}
