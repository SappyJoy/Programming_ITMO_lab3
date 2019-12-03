
public class Person extends Human implements HumanInterface{
    String name = new String();
    String pronoun = new String();
    Head head = new Head();
    String street = new String();

    public Person(String name) {
        super(name);
    }

    public Person(String name, String gender) {
        super(name, gender);
    }

    public String getHead() {
        return head.getName();
    }

    public String getPronoun() {
        return pronoun;
    }

    public String eat(String food) {
        return ("ест " + food + " ");
    }

    public  String talk(String how) {
        return ("говорит " + how + " ");
    }

    public String talk() {
        return ("говорит ");
    }

    public  String listen(String how) {
        return ("слушать " + how + " ");
    }
    public  String listen() {
        return ("слушать " + " ");
    }

    public String scream() {
        return "кричать ";
    }

    public String catched(String what, String where) {
        return ("уловить " + what + where);
    }

    public String think(String idea) {
        return "подумал -- " + "\"" + idea + "\"";
    }

    public String sing() {
        return "петь ";
    }

    public String scold() {
        return "браниться ";
    }

    public String laugh() {
        return "смеяться ";
    }

    public String cry() {
        return "плакать ";
    }

    public String dontKnow() {
        return "не знать ";
    }

    public String sit(String where) {
        return "сидеть на " + where + " ";
    }
}
