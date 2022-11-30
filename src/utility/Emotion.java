package utility;

public enum Emotion {
    NICE("приятно"), EMOTION("мило");
    private final String emo;

    Emotion(String emo){
        this.emo = emo;
    }

    @Override
    public String toString() {
        return emo;
    }
}
