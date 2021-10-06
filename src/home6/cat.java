package home6;

public class cat extends animal {
    public static int countCat = 0;
    public static String typeThisClass = "Кот";

    cat(String name, float run, float swim) {
        super(typeThisClass,name,run,swim);
        ++countCat;
    }
    @Override
    protected int onSwim(float distance) {
        return animal.swimBad;
    }
}
