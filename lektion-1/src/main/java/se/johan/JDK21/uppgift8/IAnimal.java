package se.johan.JDK21.uppgift8;

public sealed interface IAnimal permits Dog, Cat {
    void sound();
}
