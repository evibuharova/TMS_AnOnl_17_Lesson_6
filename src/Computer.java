public class Computer {
    int price;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(String model, int price) {
        this.model = model;
        this.price = price;
        this.ram = new RAM();
        this.hdd = new HDD();
    }


    public Computer(RAM ram, HDD hdd, String model, int price) {
        this.ram = ram;
        this.hdd = hdd;
        this.model = model;
        this.price = price;

    }

    public void print() {
        System.out.println("Price: " + price);
        System.out.println("Model: " + model);
        System.out.println("RAM: ");
        ram.print();
        System.out.println("HDD: ");
        hdd.print();
    }
}
