public class Prepositions {
    static public String and() {
        return "и ";
    }
    static public String but() {
        if ((int) (Math.random() * 2) == 0)
            return "но ";
        else
            return "а ";
    }
    static public String because() {
        if ((int) (Math.random() * 2) == 0)
            return "из-за ";
        else
            return "от ";
    }

    static public String from() {
        if ((int) (Math.random() * 2) == 0)
            return "c ";
        else
            return "из ";
    }

    static public String on() {
        return "о ";
    }

    static public String dash() {
        return "-- ";
    }
    static public String in() {

        return "в ";
    }

    static public String that() {
        return ", что ";
    }

    static public String like() {
        return ", как ";
    }
}
