package se.johan.JDK21.uppgift8;

public non-sealed class Dog implements IAnimal {
    @Override
    public void sound() {
        System.out.println("Bark!");
    }
}
