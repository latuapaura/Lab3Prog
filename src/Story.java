import classes.*;
import utility.Emotion;
import utility.FlowerColor;
import utility.Position;

public class Story {
    public static void main(String[] args) {
        Wind wind = new Wind();
        Tree tree = new Tree();
        System.out.println();
        wind.nalet(tree);
        Human human = new Human();
        tree.wave(human);
        tree.whisper();
        Flower PinkFlower = new Flower(FlowerColor.PINK);
        Flower BlueFlower = new Flower(FlowerColor.BLUE);
        PinkFlower.changePos(Position.inGrass);
        BlueFlower.changePos(Position.inGrass);
        PinkFlower.dazzle();
        BlueFlower.dazzle();
        human.lookAt(PinkFlower);
        human.lookAt(BlueFlower);
        human.changeEmotion(Emotion.Nice);
        Birds birds = new Birds();
        birds.changePos(Position.up);
        birds.fluttered();
        birds.tweet();
        birds.changePos(Position.inGrass);
        birds.peck();
        birds.changePos(Position.up);
        human.lookAt(birds);
        human.stay();
        SingleBird singeBird = new SingleBird();
        singeBird.seatOn(human);
        singeBird.looking_around();
        singeBird.fly();
        singeBird.beat(human);
        human.changeEmotion(Emotion.emotion);
        human.gotEmotional();
        human.cry();
    }
}