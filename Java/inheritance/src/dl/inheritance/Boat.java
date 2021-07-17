package dl.inheritance;

public class Boat extends Vehicle {
    private int tons;

    public Boat(int tons) {
        this.tons = tons;
        setName(this.getClass().getSimpleName());
    }

    public int getTons() {
        return tons;
    }

    public void setTons(int tons) {
        this.tons = tons;
    }

    @Override
    public String toString() {
        return "{name=" + getName() +
                ", tons=" + tons +
                '}';
    }
}
