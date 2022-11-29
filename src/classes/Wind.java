package classes;

import utility.Entity;

public class Wind extends Entity {
    public Wind(){
        super("Теплый ласковый ветерок");
        this.connectToStory();
    }
    public void raid(Entity entity){
        System.out.println(this.getName() + " налетел на " + entity.getName().toLowerCase());
    }
}
