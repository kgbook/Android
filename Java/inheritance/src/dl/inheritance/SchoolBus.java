package dl.inheritance;

class SchoolBus extends Bus {
    public SchoolBus() {
        setName(this.getClass().getSimpleName());
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{name=" + getName() +
                ", price=" + price +
                '}';
    }
}
