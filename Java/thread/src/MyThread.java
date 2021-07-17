public class MyThread extends Thread {
    private final int MAX_TIMES = 9;
    public static int num = 0;

    private void prepare() {
        setName(this.getClass().getSimpleName());
    }

    void declareLove(int times) {
        for (var cnt = 0; cnt < times; cnt++) {
            System.out.println("I love you, num: " + num);
        }
    }
    @Override
    public void run() {
        try {
            prepare();
            declareLove(MAX_TIMES);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        } finally {
            System.out.println(getName() + " is exiting now! num:" + num);
        }
    }
}
