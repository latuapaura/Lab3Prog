package utility;

public abstract class Entity implements GetProp {
    private String name;
    public Entity(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connectToStory(){
        System.out.println(this.getName()+" присоединяется к рассказу");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
