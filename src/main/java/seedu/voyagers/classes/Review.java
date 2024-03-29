package seedu.voyagers.classes;

public class Review {

    private int score;

    private String reflection;

    public Review(){
        this.score = -1;
        this.reflection = null;
    }

    public void setScore(int score) {
        this.score = score;
        this.reflection = "";
    }

    public void setReflection(String reflection) {
        this.reflection = reflection;
    }

    public int getScore() {
        return score;
    }

    public String getReflection() {
        return reflection;
    }

    @Override
    public String toString(){
        return "Score: " + score + ", Reflection: " + reflection;
    }
}
