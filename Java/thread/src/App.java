public class App {
    public static void main(String[] args) {
        var myThread = new MyThread();
        myThread.start();
        while (myThread.isAlive()) {
            MyThread.num++;
        }
        System.out.println("main thread exited! num:" + myThread.num);
    }
}
