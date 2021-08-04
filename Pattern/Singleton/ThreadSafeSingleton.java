public class ThreadSafeSingleton {
    private static final ThreadSafeSingleton instance;

    private ThreadSafeSingleton( ) {}

/** The easier way to create a thread-safe singleton class is to make the global access method synchronized,
 *  so that only one thread can execute this method at a time
*/
    // public static synchronized ThreadSafeSingleton getInstance() {
    //     if ( instance == null ) {
    //         instance = new ThreadSafeSingleton();
    //     }
    //     return instance;
    // }

/** Above implementation works fine and provides thread-safety but it reduces the performance
*   because of the cost associated with the synchronized method.
*   To avoid this extra overhead every time, double checked locking principle is used.
*   In this approach, the synchronized block is used inside the if condition with an additional check to ensure that
*   only one instance of a singleton class is created.
*/
    public static ThreadSafeSingleton getInstance() {
        synchronized ( ThreadSafeSingleton.class ) {
            if ( instance == null ) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }
}