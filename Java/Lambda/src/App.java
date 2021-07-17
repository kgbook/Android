import java.util.ArrayList;
import java.util.function.Consumer;

public class App {
    void lambdaExpression1(ArrayList<Integer> arr) {
        System.out.println("lambdaExpression1:");
        arr.forEach((val) -> {
            System.out.println(val);
        });
    }

    void lambdaExpression2(ArrayList<Integer> arr) {
        System.out.println("lambdaExpression2:");
        Consumer<Integer> method = (val) -> {
            System.out.println(val);
        };
        arr.forEach(method);
    }

    public static void main(String[] args) {
        var app = new App();
        var obj = new ArrayList<Integer>();
        obj.add(66);
        obj.add(88);
        obj.add(9);

        app.lambdaExpression1(obj);
        app.lambdaExpression2(obj);
    }
}
