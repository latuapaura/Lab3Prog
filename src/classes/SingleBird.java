package classes;

import utility.Entity;

public class SingleBird extends Entity {
    public SingleBird() {
        super("Пичужка");
        this.connectToStory();
    }
    public void seatOn(Entity target){
        System.out.println(this.getName() + " села на " + target.getName()+"а");
    }
    public void lookingAround(){
        System.out.println(this.getName() + " смотрела по сторонам");
    }
    public void fly(){
        System.out.println(this.getName() + " вспорхнула и улетела");
    }
    public void beat(Entity target){
        System.out.println(this.getName() + " задела " + target.getName()+"а");
    }
}
