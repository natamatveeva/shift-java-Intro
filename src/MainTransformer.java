import java.util.ArrayList;

public class MainTransformer {
    public static void main(String[] args) {
        ArrayList<Transformer> arrayTransformers = new ArrayList<>(4);
        Transformer autobotFirst = new Autobot("Glory");
        Transformer autobotSecond = new Autobot("Ben", false);
        Transformer decepticonFirst = new Decepticon("Jack",TransformShape.NOTEBOOK);
        Transformer decepticonSecond = new Decepticon("Mary", TransformShape.AIRPLANE,true);
        arrayTransformers.add(autobotFirst);
        arrayTransformers.add(autobotSecond);
        arrayTransformers.add(decepticonFirst);
        arrayTransformers.add(decepticonSecond);

        System.out.println("Transformers: ");
        for (int i = 0; i < arrayTransformers.size(); i++) {
            System.out.println(i + 1 + ". " + arrayTransformers.get(i).getName());
            arrayTransformers.get(i).showProperties();
            arrayTransformers.get(i).run();
            arrayTransformers.get(i).fire();
            arrayTransformers.get(i).charge();
        }

    }
}
