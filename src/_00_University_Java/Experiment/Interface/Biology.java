package _00_University_Java.Experiment.Interface;

public interface Biology {
    public abstract void breath();
}

interface Animal extends Biology {
    public abstract void move();

    public abstract void eat();
}

interface Mankind extends Animal {
    public abstract void study();

    public abstract void think();
}

class NormalMan implements Mankind {
    private String name;

    public NormalMan(String name) {
        this.name = name;
    }

    public NormalMan() {
        this.name = name;
    }

    public void move() {
        System.out.println(this.name + "can move");
    }

    public void breath() {
        System.out.println(this.name + "can breath");
    }

    public void study() {
        System.out.println(this.name + "can study");
    }

    public void think() {
        System.out.println(this.name + "can think");
    }

    public void eat() {
        System.out.println(this.name + "can eat");
    }
}