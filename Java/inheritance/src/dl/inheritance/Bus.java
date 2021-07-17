package dl.inheritance;

abstract class Bus extends Vehicle {
    protected int price = 80000;

    public Bus() {
        setName(this.getClass().getSimpleName());
    }

    abstract int getPrice();

    @Override
    public String toString() {
        return "{ name=" + getName() +
                ", price=" + price +
                '}';
    }
}
