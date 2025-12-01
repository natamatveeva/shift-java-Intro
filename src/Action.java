public interface Action {

    default void run() {
        System.out.println("Transformer is running");
    }

    void fire();
    void charge();
}
