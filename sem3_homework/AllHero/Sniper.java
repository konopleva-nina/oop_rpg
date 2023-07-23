package AllHero;

import java.util.ArrayList;

public class Sniper extends Shooter {

    public Sniper(int x, int y, int initiative) {
        super(x, y, initiative + 3, 7, 100, 1);
    }
    @Override
    public String getInfo() {
        return "Sniper [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }
}
