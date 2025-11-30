public class Autobot extends Transformer {

    private static String TEAM_NAME;
    private static final String EYE_COLOR;
    boolean kindness = true;

    static {
        TEAM_NAME = "Autobot";
        EYE_COLOR = "blue";
    }

    Autobot(String name) {

        super(name);
        String eyeColor = EYE_COLOR;
        String teamName = TEAM_NAME;
        boolean kindness;
    }

    Autobot(String name, boolean kindness) {

        super(name);
        this.kindness = kindness;
        String eyeColor = EYE_COLOR;
        String teamName = TEAM_NAME;
    }

    public void transformInto() {
        System.out.println(getName() + " transforms into car.");
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    public boolean getKindness() {
        return this.kindness;
    }

    @Override
    public void showProperties() {
        super.showProperties();
        System.out.println("I am " + TEAM_NAME + ".");
        System.out.println("My eyes are " + EYE_COLOR + ".");
        String kindnessMsg = (kindness) ? "I am kind." : "I am not kind.";
        System.out.println(kindnessMsg);
    }

}
