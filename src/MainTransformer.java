public class MainTransformer {
    public static void main(String[] args) {
        Transformer[] arrayTransformers;
        arrayTransformers = new Transformer[4];
        arrayTransformers[0] = new Autobot("Glory", false);
        arrayTransformers[1] = new Autobot("Ben");
        arrayTransformers[2] = new Decepticon("Jack","airplane");
        arrayTransformers[3] = new Decepticon("Mary","gun",true);

        for (int i = 0; i < 4; i++) {
            arrayTransformers[i].showProperties();
            arrayTransformers[i].run();
            arrayTransformers[i].fire();
            arrayTransformers[i].charge();
            System.out.println("*************");
        }

    }
}
