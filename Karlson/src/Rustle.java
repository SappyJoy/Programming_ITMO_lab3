public class Rustle extends Thing implements ThingInterface {
    String where = new String();
    public Rustle(String name, String where) {
        super(name);
        this.where = where;
    }

    public String getPlace() {
        return "из " + where + " ";
    }

    public String toHear(String how) {
        return "доносился " + how + " ";
    }
}
