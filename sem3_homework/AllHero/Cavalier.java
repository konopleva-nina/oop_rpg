package AllHero;

import java.util.ArrayList;

public class Cavalier extends Shooter {
    public Cavalier(int x, int y, int initiative) {

        super(x, y, initiative + 3, 6, 100, 1);
    }
    @Override
    public String getInfo() {
        return "Cavalier [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }
}
