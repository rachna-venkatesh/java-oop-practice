abstract class Bird {
     private String name;  

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract void fly();
    abstract void eat();
}

class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(getName() + " is flying high in the sky.");
    }

    @Override
    void eat() {
        System.out.println(getName() + " eats small animals.");
    }
}

class SerpentEagle extends Eagle {
     public SerpentEagle(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(getName() + " eats snakes and reptiles.");
    }
}

class GoldenEagle extends Eagle {
    public GoldenEagle(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println( getName() + " eats rabbits and small mammals.");
    }
}

public class Oops {
    public static void main(String[] args) {

        Bird se = new SerpentEagle("Serpent Eagle");
        Bird ge = new GoldenEagle("Golden Eagle");

        se.fly();
        se.eat();

        ge.fly();
        ge.eat();
    }
}
