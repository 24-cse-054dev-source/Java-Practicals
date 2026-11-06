class Demo {
    private String name;

    Demo(String name) {
        this.name = name;
        System.out.println("Constructor: Object '" + name + "' is created.");
    }

    void useObject() {
        System.out.println("Using object: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called: Object '" + name + "' is being garbage collected.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Creating and Using Object ---");
        Demo obj = new Demo("TestObject");
        obj.useObject();

        System.out.println("\n--- Removing Reachable References ---");
        obj = null; // Object is now eligible for garbage collection

        System.out.println("Requesting Garbage Collection...");
        System.gc(); // Suggesting JVM to run GC

        // Adding a short pause to give the GC a chance to run (non-deterministic)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }
}
