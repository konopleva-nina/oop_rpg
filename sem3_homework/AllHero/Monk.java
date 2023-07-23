package AllHero;

import java.util.ArrayList;

public class Monk extends Support{
    public Monk(int x, int y, int initiative, int actionPriority) {
        super(x, y, initiative + 2, 10, 5, 2, actionPriority);
    }

    @Override
    public String getInfo() {
        return "Monk [" + coordinates.x + ", " + coordinates.y + "] mana: " + mana + "/" + 10 + " HP: " + hp + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        super.step(enemy, team);
        BaseHero tmpAlly = team.get(0);
        double minAllyHealth = 1;

        if (!isAlive) return;

        for (BaseHero unit: team) {
            if (unit.hp / unit.max_hp < minAllyHealth && unit.isAlive) {
                minAllyHealth = unit.hp / unit.max_hp;
                tmpAlly = unit;
            }
        }
        if (minAllyHealth < 1 && mana > 0) {
            tmpAlly.getDamage(-damage);
            mana -= 1;
            state = "Healing";

            return;
        }
    }
}
