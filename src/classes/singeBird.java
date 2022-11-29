package classes;

import utility.Entity;

public class singeBird extends Entity {
    public singeBird() {
        super("Пичужка");
        this.connectToStory();
    }
    public void seatOn(Entity target){
        System.out.println(this.getName() + " села на " + target.getName()+"а");
    }
    public void looking_around(){
        System.out.println(this.getName() + " смотрела по сторонам");
    }
    public void fly(){
        System.out.println(this.getName() + " вспорхнула и улетела");
    }
    public void beat(Entity target){
        System.out.println(this.getName() + " задела " + target.getName()+"а");
    }
}
