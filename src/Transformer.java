public abstract class Transformer {
    private String name;

    protected Transformer(String name) {
        this.name = name;
    }

    public abstract void transformInto();

    public void showProperties() {
        System.out.println("My name is " + this.name + ".");
    }

    public String getName() {
        return this.name;
    }

    public void setName(double width) {
        this.name = name;
    }

}
