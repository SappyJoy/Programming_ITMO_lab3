public abstract class Thing {
    protected String name;
    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name + " ";
    }

    public String getName(String how) {
        return how + " " + this.getName() + " ";
    }

    @Override
    public String toString() {
        return "Thing: " + getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        boolean equ = (obj.hashCode() == this.hashCode()) ? true : false;
        return equ;
    }
}
