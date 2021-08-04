public class Test {
    static {
        System.out.println("Static initialization block!");
    }

    {
        System.out.println("Non-static initialization block!");
    }

    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test();
        System.out.println("exit");
    }
}
