import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        var obj = new HashSet<String >();
        obj.add("USA");
        obj.add("German");
        System.out.println(obj);

        if (!obj.contains("Japan")) {
            System.out.println("Japan not exist!");
        }
        for (var item : obj) {
            System.out.println(item);
        }
        obj.add("Vietnam");

//        var intObj = new HashSet<int>(); // compile-time error
        var intObj = new HashSet<Integer>();
        intObj.add(666);
        intObj.add(888);
        intObj.add(999);
        for (var val = 885; val < 890; val++) {
            if (intObj.contains(val)) {
                System.out.println(val);
            }
        }
    }
}
