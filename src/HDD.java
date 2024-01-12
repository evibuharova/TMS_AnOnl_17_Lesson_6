public class HDD {
    private String name;
    private int volume;
    private Type type;

    public HDD() {
        this.name = "nameHdd";
        this.volume = 0;
        this.type = Type.INTERNAL;
    }

    public HDD(String name, int volume, Type type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Volume: " + volume);
        System.out.println("Type: " + type);
    }
}
