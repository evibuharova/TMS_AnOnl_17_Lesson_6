public class RAM {
    private String name;
    private int volume;

    public RAM() {
        this.name = "nameRam";
        this.volume = 0;
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Volume: " + volume);
    }
}
