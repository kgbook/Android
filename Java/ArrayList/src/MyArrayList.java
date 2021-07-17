import java.util.ArrayList;
/**
 * The ArrayList class is a resizable array.
 * The difference between a built-in array and an ArrayList in Java,
 * is that the size of an array cannot be modified
 * (if you want to add or remove elements to/from an array,you have to create a new one).
 * While elements can be added and removed from an ArrayList whenever you want.
 * */
public class MyArrayList {
    public static void main(String[] args) {
        var obj = new ArrayList<String>();
        obj.add("Tecent");
        obj.add("Alibaba");
        obj.add("OPPO");
        System.out.println(obj);
        System.out.println(obj.get(0));
    }
}
