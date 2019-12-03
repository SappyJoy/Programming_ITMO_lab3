
public class Novel {
    public static void main(String[] args) {
        String[] s = new String[100];
        Person karlson = new Person("Карлсон", "male");
        Person kid = new Person("Малыш", "male");
        Evening evening = new Evening();
        AromaLime aromaLime = new AromaLime("аромат цветущих лип ");
        KnockingHeels knockingHeels = new KnockingHeels("стук каблуков ", "плиты тротуара");
        WalkingPeople walkingPeople = new WalkingPeople("Много людей", new Person("Карл", "male"), new Person("Питер", "male"),
                                                        new Person("Элизабет", "female"), new Person("Ларс", "male"), new Person("Ева", "female"));
        Rustle rustle = new Rustle("шорох", "соседние дома");
        LivingPeople people = new LivingPeople(new Person("Линнея", "female"), new Person("Биргитта", "female"), new Person("Пьер", "male"),
                new Person("Эрик", "male"), new Person("Олоф", "male"), new Person("Ханс", "male"));
        Person nobody = new Person("никто", "male");
        Person guy = new Person("мальчишка", "male");
        LittleThings roof = new LittleThings("крыша высокого дома");
        LittleThings sounds = new LittleThings("сплетение звуков");
        LittleThings music = new LittleThings("самая настаящая музыка");

        s[0] = makeSentence(karlson.getName() + karlson.eat("булочку") + Prepositions.and() + karlson.talk());
        s[1] = makeSentence(Prepositions.but() + kid.getName() + kid.listen("рассеяно") + ", " + kid.getHead() + kid.head.cycling() +
                            Prepositions.because() + evening.getSmells() + Prepositions.and() + evening.getSounds());
        s[2] = makeSentence(kid.getPronoun() + kid.catched(aromaLime.getName(), Prepositions.from() + kid.street + Prepositions.and() + karlson.street) + Prepositions.and()
                            + kid.listen(knockingHeels.getName()) + Prepositions.dash() + walkingPeople.getName() + walkingPeople.walk() + Prepositions.in() +
                            evening.getName("ясный") + walkingPeople.getPeople());
        s[3] = makeSentence(kid.getName() + kid.think("Какой летний звук!"));
        s[4] = makeSentence(evening.getName("тихий") + Prepositions.and() + rustle.getName("каждый") + rustle.getPlace() + rustle.toHear("удивительно отчётливо")
                            + ": " + people.person1.getName() + people.person1.talk() + Prepositions.and() + people.person2.getName() + people.person2.scream() + Prepositions.and() +
                            people.person3.getName() + people.person3.sing() + Prepositions.and() + people.person4.getName() + people.person4.scold() + Prepositions.and() +
                            people.person5.getName() + people.person5.laugh() + Prepositions.and() + people.person6.getName() + people.person6.cry());
        s[5] = makeSentence(Prepositions.and() + nobody.getName() + nobody.dontKnow() + Prepositions.that() + guy.getName() + guy.sit(roof.getName()) + Prepositions.and()
                             + guy.listen(sounds.getName()) + Prepositions.like() + music.getName());
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null)
            System.out.println(s[i]);
        }
    }
    static String makeSentence(String s) {
        if (s.charAt(0) >= 1072)
            s = (char)(s.charAt(0) - 32) + s.substring(1, s.length() - 1) + ". ";
        else
            s = s.substring(0, s.length() - 1) + ". ";
        return s;
    }
}
