package sample.singletonclass;

class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton class!");
    }
}

public class SingletonClassExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(); // Get the single instance
        singleton.showMessage(); // Call method on the singleton instance
    }
}
