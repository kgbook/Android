package dl.inheritance;

public class Transportation {
    public static void main(String[] args) {
        Vehicle bus1 = new SchoolBus();
        System.out.println(bus1);

        Vehicle bus2 = new Vehicle();
        System.out.println(bus2);

        var boat = new Boat(5);
        System.out.println(boat);
        System.out.println(boat.toString());
    }
}
