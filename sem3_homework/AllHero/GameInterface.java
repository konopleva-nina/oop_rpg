package AllHero;

import java.util.ArrayList;

public interface GameInterface {

    void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);
    String getInfo();
}
