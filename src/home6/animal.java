package home6;

public abstract class animal {

    static final int swimGod = 1;
    static final int swimBad = -1;
    static final int swimNorm =0;



    private String type;
    protected String name;
    private float run;
    private float swim;

    public static int howAnimal = 0;

    animal(String type, String name, float run,float swim) {
    this.type = type;
    this.name = name;
    this.run = run;
    this.swim = swim;
    ++howAnimal;
}

    String getType() { return this.type; }
    String getName() { return this.name; }
    float getRun() { return this.run; }
    float getSwim() { return  this.swim; }

    protected boolean onRun ( float distance) {
        return (distance <= run);
    }
    protected int onSwim ( float distance) {
        return (distance <= swim) ? swimGod : swimBad;
    }

}
