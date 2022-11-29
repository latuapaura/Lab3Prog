package classes;

import utility.Entity;

public class Tree extends Entity {
    private Leafs leafs;
    public Tree() {
        super("Дерево");
        this.connectToStory();
        leafs = new Leafs();
    }
    public void wave(Entity target){
        System.out.println(this.getName() + " машет " + target.getName() +"у "+ leafs.getName() +"ми");
    }
    public void whisper(){
        System.out.println(this.getName()+" что-то шепчет");
    }
}
