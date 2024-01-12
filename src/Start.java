public class Start {

    public static void main(String[] args) {
        Computer computer1 = new Computer("Great", 100);
        computer1.print();

        Computer computer2 = new Computer(new RAM("Dss", 32), new HDD("Sdd", 64, Type.INTERNAL), "TRR", 72);
        computer2.print();
    }
}
