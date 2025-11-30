public class MainTransformer {
    public static void main(String[] args) {
        Autobot[] arrayAutobots;
        arrayAutobots = new Autobot[2];
        arrayAutobots[0] = new Autobot("Glory", false);
        arrayAutobots[1] = new Autobot("Ben");
        Decepticon[] arrayDecepticons;
        arrayDecepticons = new Decepticon[2];
        arrayDecepticons[0] = new Decepticon("Jack","airplane");
        arrayDecepticons[1] = new Decepticon("Mary","tank",true);

        System.out.println("Autobots: ");
        for (int i = 0; i < 2; i++) {
            System.out.println(i + 1 + ". " + arrayAutobots[i].getName());
            arrayAutobots[i].showProperties();
            arrayAutobots[i].run();
            arrayAutobots[i].fire();
            arrayAutobots[i].charge();
            arrayAutobots[i].transformInto();
        }

        System.out.println("*************");

        System.out.println("Decepticons: ");
        for (int i = 0; i < 2; i++) {
            System.out.println(i + 1 + ". " + arrayDecepticons[i].getName());
            arrayDecepticons[i].showProperties();
            arrayDecepticons[i].run();
            arrayDecepticons[i].fire();
            arrayDecepticons[i].charge();
            arrayDecepticons[i].transformInto();
        }

    }
}
