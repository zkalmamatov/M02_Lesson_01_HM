public class Cats {

    private String name;
    private Color color;


    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }




    public Cats(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getInfo() {
        return "name: " + name +
                "\ncolor: " + color;
    }

}
