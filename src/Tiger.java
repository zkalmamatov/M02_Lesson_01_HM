public class Tiger extends Cats {

    private int age;
    private LifeType lifeStyle;

    public int getAge() {
        return age;
    }


    public LifeType getLifeStyle() {
        return lifeStyle;
    }


    public Tiger(String name, Color color, int age, LifeType lifeStyle) {
        super(name, color);
        this.age = age;
        this.lifeStyle = lifeStyle;
    }

    void act() {
        System.out.println(super.getName() + " hunts");
    }

    final void act(String acts) {
        System.out.println(super.getName() + acts);
    }


    public String getInfo() {
        return super.getInfo() +
                "\nage: " + age +
                "\nType: " + lifeStyle.getType() +
                "\nHabitat: " + lifeStyle.getHabitat();
    }
}
