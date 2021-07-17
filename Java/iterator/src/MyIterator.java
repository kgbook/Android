import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;

public class MyIterator {
    void iterator_set() {
//        var setObj = new HashSet<int>(); // compile-time error
        var setObj = new HashSet<Integer>();
        for (var val = 0; val < 10; val++) {
            setObj.add(val);
        }

        var it = setObj.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        it = setObj.iterator();
        while (it.hasNext()){
            if (it.next() == 9) {
                it.remove();
                System.out.println("remove 9!");
            }
        }
        System.out.println();
        System.out.println(setObj);
    }

    void iterator_map() {
//        var mapObj = new HashMap<int, String>(); // compile-time error
        var mapObj = new HashMap<Integer, String>();
        mapObj.put(120, "Ambulance");
        mapObj.put(110, "Police");
        mapObj.put(119, "Forest fire");

        // KeySet
        System.out.println();
        for (var key : mapObj.keySet()) {
            System.out.println(key + ": " + mapObj.get(key));
        }

        // Iterator
        System.out.println();
        var iterator = mapObj.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        var obj = new MyIterator();
        obj.iterator_set();
        obj.iterator_map();
    }
}
