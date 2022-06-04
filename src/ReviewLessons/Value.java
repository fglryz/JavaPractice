package ReviewLessons;

public class Value {

        //WRITE YOUR CODE HERE
        private int value;
        private static boolean isModified;

    public Value(int value) {
        this.value = value;
    }
    public Value(){

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static boolean wasIsModified() {
        return isModified;
    }

    public static void setIsModified(boolean isModified) {
        Value.isModified = isModified;
    }
}




