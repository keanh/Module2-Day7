import edible.Edible;

public abstract class Animal {
    public abstract String makeSound();
}

class Tiger extends Animal{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr";
    }
}

class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}


