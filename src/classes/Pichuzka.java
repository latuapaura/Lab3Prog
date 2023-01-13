package classes;

import utility.BirdAdj;
import utility.Entity;

public class Pichuzka extends Entity {
    private String name;

    public Pichuzka(){
        super("Пичужка");
        this.connectToStory();
    }

    public void satOnShoulder(Skuperfild skuperfild){
        System.out.println(this.getName() + " села на плечо " + skuperfild.getName());
    }

    public void lookedWay(){
        System.out.println(this.getName() + " поглядывала по сторонам, наклоняя голову то на один бок то на другой");
    }

    public void fliedAway(Skuperfild skuperfild){
        System.out.println(this.getName() +  " вспорхнула и улетела, задев " + skuperfild.getName() + " по щеке краем крыла");
    }


}
