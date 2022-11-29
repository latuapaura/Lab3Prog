package utility;

public enum Emotion {
    Nice("приятно"), emotion("мило");
    private final String emo;


    Emotion(String emo){
        this.emo = emo;
    }

    @Override
    public String toString() {
        return emo;
    }
}
