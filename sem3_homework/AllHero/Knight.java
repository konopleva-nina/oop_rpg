package AllHero;

import java.util.ArrayList;

public class Knight extends Shooter {
    public Knight(int x, int y, int initiative) {
        super(x, y, initiative + 3, 8, 15, 0);
    }
    @Override
    public String getInfo() {
        return "Knight [" + coordinates.x + ", " + coordinates.y + "] arrows: " + arrows + " HP: " + hp + "/" + max_hp + " " + state;
    }
}
