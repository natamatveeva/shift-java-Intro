public interface Action {

    default public void run() {
        System.out.println("Transformer is running");
    }

    static void fire() { System.out.println("Transformer is shooting"); }

    static void charge() {
        System.out.println("Transformer is charging");
    }
}
