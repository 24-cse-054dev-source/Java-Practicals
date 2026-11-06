interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

class Machine {
    void powerOn() {
        System.out.println("Machine is powered on.");
    }
}

interface Networkable {
    void connectWiFi();
}

class SmartPrinter extends Machine implements Printable, Scannable, Networkable {
    public void print() {
        System.out.println("SmartPrinter is printing wirelessly...");
    }

    public void scan() {
        System.out.println("SmartPrinter is scanning to cloud...");
    }

    public void connectWiFi() {
        System.out.println("Connected to Wi-Fi network.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AllInOnePrinter Demonstration ---");
        AllInOnePrinter basicPrinter = new AllInOnePrinter();
        basicPrinter.print();
        basicPrinter.scan();

        System.out.println("\n--- Hybrid Structure Demonstration ---");
        SmartPrinter smartPrinter = new SmartPrinter();
        smartPrinter.powerOn();
        smartPrinter.connectWiFi();
        smartPrinter.print();
        smartPrinter.scan();
    }
}
