// Example of multiple interfaces

interface Printer{
    void print();
}

interface ScannerDevice{
    void scan();
}

class AllInOne implements Printer, ScannerDevice{
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class MultipleInterfaceDemo{
    public static void main(String[] args) {
        AllInOne a = new AllInOne();
        a.print();
        a.scan();
    }
}
