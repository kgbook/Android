import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        var obj = new HashMap<String, String>();
        obj.put("H264", "VBR");
        obj.put("H265", "AVBR");
        System.out.println(obj);
        System.out.println(obj.get("H265"));
        obj.remove("H264");
        obj.put("MJPG", "FIXQP");
        System.out.println(obj);

        obj.clear();
        obj.put("H265", "CBR");
        System.out.println(obj);
    }
}
