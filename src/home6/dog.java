package home6;

public class dog extends animal {
    public static int countDog = 0;
    public static String typeThisClass = "Собака";

    dog(String name, float run, float swim) {
        super(typeThisClass,name,run,swim);
        ++countDog;
    }
}
