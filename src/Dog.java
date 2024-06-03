import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Dog extends Pet {

    private String name;
    private String bread;
    private String[] commands;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog() {

    }

    public Dog(String name, String bread, String[] commands,
               Color color, Shelter shelter) {
        this.name = name;
        this.bread = bread;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String bread,
               Color color, Shelter shelter) {
        this.name = name;
        this.bread = bread;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public void makeVoice() {
        System.out.println("Собака издает звук");
    }

    public void makeVoice(String voice) {
        System.out.println("Собака издает звук " + voice);
    }

    public String getInfo () {
        return super.getInfo() + " " +
                "\nName: " + name +
                "\nBread: " + bread +
                "\nCommands: " + Arrays.toString(commands);
    }



}
