import classes.*;
import utility.Emotion;
import utility.FlowerColor;
import utility.Position;

public class Story {
    public static void main(String[] args) {
        Wind wind = new Wind();
        Tree tree = new Tree();
        System.out.println();
        wind.raid(tree);
        Human human = new Human();
        tree.wave(human);
        tree.whisper();
        Flower PinkFlower = new Flower(FlowerColor.PINK);
        Flower BlueFlower = new Flower(FlowerColor.BLUE);
        PinkFlower.changePos(Position.INGRASS);
        BlueFlower.changePos(Position.INGRASS);
        PinkFlower.dazzle();
        BlueFlower.dazzle();
        human.lookAt(PinkFlower);
        human.lookAt(BlueFlower);
        human.changeEmotion(Emotion.NICE);
        Birds birds = new Birds();
        birds.changePos(Position.UP);
        birds.fluttered();
        birds.tweet();
        birds.changePos(Position.INGRASS);
        birds.peck();
        birds.changePos(Position.UP);
        human.lookAt(birds);
        human.stay();
        SingleBird singeBird = new SingleBird();
        singeBird.seatOn(human);
        singeBird.lookingAround();
        singeBird.fly();
        singeBird.beat(human);
        human.changeEmotion(Emotion.EMOTION);
        human.gotEmotional();
        human.cry();
    }
}