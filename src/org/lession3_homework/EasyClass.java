package org.lession3_homework;

public class EasyClass {
    private Colour colour;
    private String name;
    private int weight;

    public String printEasyClass() {
        return (this.colour + " " + this.name + " " + this.weight );
    }

    public EasyClass(Colour colour) {
        this.colour = colour;
    }
    public EasyClass(Colour colour, int weight ) {
        this.colour = colour;
        this.weight = weight;
    }
    public EasyClass() {

    }

    @Override
    public String toString() {
        return "EasyClass{" +
                "colour=" + colour +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class EasyClassProgram {
    public static void main(String[] args) {
        EasyClass car1 = new EasyClass(Colour.Red, 2500);
        EasyClass car2 = new EasyClass(Colour.Silver);
        System.out.println(car1.printEasyClass());
        System.out.println(car2.printEasyClass());
}
}
