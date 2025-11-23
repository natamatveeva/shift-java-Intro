public class Transformer {
    private String name;

    Transformer(String name) {
        this.name = name;
    }

    void run() { System.out.println(this.name + " is running"); }

    void fire() { System.out.println(this.name + " is shooting"); }

    void charge() { System.out.println(this.name + " is charging"); }

    void showProperties() {
        System.out.println("My name is " + this.name + ".");
    }

    public String getName() {
        return this.name;
    }

    public void setName(double width) {
        this.name = name;
    }

}
