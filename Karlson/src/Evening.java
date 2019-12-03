public class Evening extends Thing{
    protected String smells = new String("запахи");
    protected String sounds = new String("звуки");

    public Evening() {
        super("вечер");
    }


    public String getSmells() {
        return smells + " вечера ";
    }

    public String getSounds() {
        return sounds + " вечера ";
    }
}
