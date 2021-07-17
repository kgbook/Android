import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        var obj = new LinkedList<String>();
        obj.add("OPPO");
        obj.add("Vivo");
        obj.add("Xiaomi");
        System.out.println(obj);

        obj.removeFirst();
        System.out.println(obj.getFirst());

        obj.addFirst("Huawei");
        System.out.println(obj);

        obj.removeLast();
        obj.addLast("Honor");
        System.out.println(obj);
    }
}
