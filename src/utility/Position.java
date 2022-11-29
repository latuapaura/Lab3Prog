package utility;

public enum Position {
    inGrass("в траве"), up("в ветвях");
    private final String pos;
    Position(String pos){
        this.pos = pos;
    }

    @Override
    public String toString() {
        return pos;
    }
}
