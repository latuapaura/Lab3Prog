package classes;

import utility.Entity;
import utility.Position;

public class Birds extends Entity {
    private Position position;
    public Birds() {
        super("Маленькие красногрудые птички");
        this.connectToStory();
    }
    public void fluttered(){
        System.out.println(this.getName() + " порхали " + this.position);
    }
    public void tweet(){
        System.out.println(this.getName()+ " чирикали");
    }
    public void peck(){
        System.out.println(this.getName() + " клюют что-то " + this.position);
    }
    public void changePos(Position pos){
        this.position = pos;
    }


}
