public class Decepticon extends Transformer {
    private static String TEAM_NAME;
    private static String EYE_COLOR;
    boolean kindness = false;
    String transformTo;

    static {
        TEAM_NAME = "Decepticon";
        EYE_COLOR = "red";
    }

    Decepticon(String name, String transformTo) {

        super(name);
        String eyeColor = EYE_COLOR;
        String teamName = TEAM_NAME;
        boolean kindness;
        this.transformTo = transformTo;
    }

    Decepticon(String name, String transformTo, boolean kindness) {

        super(name);
        this.kindness = kindness;
        String eyeColor = EYE_COLOR;
        String teamName = TEAM_NAME;
        this.transformTo = transformTo;
    }

    public void transformInto() {
        System.out.println(getName() + " transforms into " + this.transformTo + ".");
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
