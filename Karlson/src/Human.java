abstract public class Human {
    protected String name;
    protected String pronoun;
    protected Head head;
    protected String street;

    public Human(String name) {
        this.name = name + " ";
        this.pronoun = "оно ";
    }

    public Human(String name, String gender) {
        this.name = name + " ";
        switch (gender) {
            case "male":
                this.pronoun = "он ";
                break;
            case "female":
                this.pronoun = "она ";
                break;
            case "thing":
                this.pronoun = "оно ";
        }
        head.setName("голова у " + getName());
        street = getName() + "улица ";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  getName() + " Pronoun: " + pronoun;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Human other = (Human) obj;
        boolean equ = (obj.hashCode() == this.hashCode()) ? true : false;
        return equ;
    }
}
