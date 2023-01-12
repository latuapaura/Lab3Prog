package classes;

import utility.BirdAdj;
import utility.Emotion;
import utility.Entity;

public class Skuperfild extends Entity {
    private Emotion emo;
    public Skuperfild() {
        super("Скуперфильд");
        this.connectToStory();
    }

    public void toFeel(Tree tree){
        System.out.println(this.getName() + " казалось, что " + tree.getName() + " машут и шумят");
    }

    public void dontKnow(Emotion emo) {
        this.emo = emo;
        System.out.println(this.getName() + " не знал, как они называются, но смотреть на них ему было чрезвычайно " + this.emo);
    }

    public void dontSee(Birds birds, BirdAdj adj, Emotion emo) {
        System.out.println(this.getName() + " никогда не видел " + adj + birds.getName() + " вблизи, и смотреть на них доставляло ему величайшее " + emo);

    }
    public void seenLike(){
        System.out.println(this.getName() + " был принят за обгорелый пень");
    }

    public void feltSoft(){
        System.out.println(this.getName() + " почувствовал умиление");
    }

    public void startedToCry(){
        System.out.println(this.getName() + ", ощутив нежное прикосновение этого милого существа, расчувствовался и заплакал");
    }

}
