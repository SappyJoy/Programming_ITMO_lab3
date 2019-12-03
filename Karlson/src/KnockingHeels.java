public class KnockingHeels extends Thing implements ThingInterface{

    public KnockingHeels(String name, String where) {
        super(name);
        this.name = name + Prepositions.on() + where;
    }

    public String getName() {
        return name;
    }
}
