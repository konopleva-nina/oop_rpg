import AllHero.Peasant;

public enum Names {

    Knight("magnificent Arthur"), Magician("wizard Olaf"), Monk("Saint John"), Sniper("apt Jane"), Peasant("farmer Bill"),
    Robber("bandit Joe"), Cavalier("brave Rudolf"), Archer("arrow Anna"), Spearman("lucky Ben");

    private String name;

    Names(String name) {this.name = name;}

    public String getName() {return name;}
}
