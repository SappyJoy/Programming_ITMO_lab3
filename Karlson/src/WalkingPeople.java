public class WalkingPeople {
    String name;
    Person person1;
    Person person2;
    Person person3;
    Person person4;
    Person person5;

    public WalkingPeople(String name, Person person1, Person person2, Person person3, Person person4, Person person5) {
        this.name = name;
        this.person1 = person1;
        this.person2 = person2;
        this.person3 = person3;
        this.person4 = person4;
        this.person5 = person5;
    }

    public String getName() {
        return name + " ";
    }

    public String getPeople() {
        return ": " + person1.getName() + ", " + person2.getName() + ", " + person3.getName() + ", " + person4.getName() + ", " + person5.getName();
    }

    public String walk() {
        return "гулять ";
    }
}
