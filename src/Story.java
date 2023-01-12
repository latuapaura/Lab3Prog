import classes.*;
import classes.Birds;
import classes.Flowers;
import classes.Leafs;
import classes.Wind;
import utility.*;

public class Story {
    public static void main(String[] args) {
        var skuperfild = new Skuperfild();
        var birds = new Birds();
        var pichuzka = new Pichuzka();
        var wind = new Wind();
        var leafs = new Leafs();
        var grass = new Grass();
        var tree = new Tree();
        var pinkFlower = new Flowers(FlowerColor.PINK);
        var blueFlower = new Flowers(FlowerColor.BLUE);


        skuperfild.exist();
        skuperfild.breath();
        skuperfild.toSee();
        birds.exist();
        birds.breath();
        birds.toSee();
        pichuzka.exist();
        pichuzka.breath();
        pichuzka.toSee();

        wind.changeAdj(WindAdj.WARM);
        wind.changeAdj(WindAdj.GENTLE);
        wind.raid(tree, leafs);
        skuperfild.toFeel(tree);
        tree.whisper();
        pinkFlower.changePos(Position.INGRASS);
        blueFlower.changePos(Position.INGRASS);
        pinkFlower.dazzle(grass);
        blueFlower.dazzle(grass);
        skuperfild.dontKnow(Emotion.NICE);
        birds.tweet(BirdAdj.REDTUMMY);
        birds.changePos(Position.UP);
        birds.peck(grass, BirdAdj.REDTUMMY, Position.INGRASS);
        birds.changePos(Position.UP);
        skuperfild.dontSee(birds, BirdAdj.FOREST, Emotion.PLEASURE);
        birds.stoppedToScary(skuperfild, BirdAdj.REDTUMMY);
        pichuzka.satOnShoulder(skuperfild);
        skuperfild.seenLike();
        pichuzka.lookedWay();
        pichuzka.fliedAway(skuperfild);
        skuperfild.feltSoft();
        skuperfild.startedToCry();

        System.out.println("Плакали всей маршруткой");
    }
}