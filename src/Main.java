public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter("Peace ", "Chuy 1");
        String[] commands = {"Sit", "Run"};
        Dog dog = new Dog("Rex", "Seint Bernard",
                commands, Color.WHITE, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        System.out.println();


        Shelter shelter_2 = new Shelter("Home ", "Chuy 2");
        Dog dog_2 = new Dog("Rex", "Seint Bernard",
                Color.BLACK, shelter_2);
        System.out.println(dog_2.getInfo());
        dog_2.makeVoice("woof woof");
        System.out.println();


        LifeType liveType = new LifeType("freedom", "nature");
        Tiger tiger = new Tiger("Marti", Color.YELLOW, 7, liveType);
        System.out.println(tiger.getInfo());
        tiger.act();
        System.out.println();

        LifeType liveType_2 = new LifeType("unfree", "home");
        HomeCat homeCat = new HomeCat("Barsik", Color.GRAY, 4, liveType_2);
        System.out.println(homeCat.getInfo());
        homeCat.act(" say meow");
        homeCat.act();
        System.out.println();

        HomeCat homeCat_2 = new HomeCat("Leo", Color.WHITE, 3, liveType_2);
        System.out.println(homeCat.getInfo());
        homeCat_2.act(" eats");
        homeCat_2.act();


    }
}


