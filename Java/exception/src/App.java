public class App {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("exit!");
        }
    }
}
