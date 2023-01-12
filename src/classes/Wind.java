package classes;

import utility.Nature;
import utility.WindAdj;

public class Wind extends Nature {

    private WindAdj adj;

    public boolean changeAdj(WindAdj adj){
        this.adj = adj;
        System.out.println(this.getName() + " " + this.adj);
        return true;
    }
    public Wind(){
        super( "ветерок");
        this.connectToStory();
    }


    public void raid(Tree tree, Leafs leafs){
        System.out.println(this.getName() + " налетал порывами и шевелил на " + tree.getName() + " " + leafs.getName());
    }
}
