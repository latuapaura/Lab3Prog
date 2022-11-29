package classes;

import utility.Emotion;
import utility.Entity;
import utility.HumanUses;

public class Human extends Entity implements HumanUses {
    private Emotion emo;
    public Human() {
        super("Скуперфильд");
        this.connectToStory();
    }
    public void lookAt(Entity target){
        System.out.println(this.getName() + " посмотрел на " + target.getName().toLowerCase());
    }
    public void stay(){
        System.out.println(this.getName() + " стоял неподвижно");
    }
    public void changeEmotion(Emotion emo){
        this.emo = emo;
        System.out.println(this.getName() + "у стало " + this.emo);
    }
    public void gotEmotional(){
        System.out.println(this.getName() + " расчувствовался");
    }
    public void cry(){
        System.out.println(this.getName() + " заплакал");
    }
}
