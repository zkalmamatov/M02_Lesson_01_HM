final class HomeCat extends Tiger {


    public HomeCat(String name, Color color, int age, LifeType lifeStyle) {
        super(name, color, age, lifeStyle);
    }

    void act () {
        System.out.println(super.getName() + " sleep");
    }


}
