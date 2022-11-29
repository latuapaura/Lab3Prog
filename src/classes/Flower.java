package classes;

import utility.Entity;
import utility.FlowerColor;
import utility.Position;

public class Flower extends Entity {
    private Position pos;
    public Flower(FlowerColor color) {
        super(color + " цветы");
        this.connectToStory();
    }

    public void dazzle(){
        System.out.println(this.getName() + " пестреют");
    }

    public boolean changePos(Position pos){
        this.pos = pos;
        System.out.println(this.getName() + " " + this.pos);
        return true;
    }

}
