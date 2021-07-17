public class App {
    public static void main(String[] args) {
        PayloadType type = PayloadType.H265;
        StreamAttribute.Resolution resolution1 = StreamAttribute.Resolution.HIGH;
        StreamAttribute.Resolution resolution2 = StreamAttribute.Resolution.MEDIUM;
        var attr = new StreamAttribute();

        System.out.println(type);
        System.out.println(resolution1);
        System.out.println(resolution2);

        attr.traverse();
        attr.condition(resolution1);
    }
}
