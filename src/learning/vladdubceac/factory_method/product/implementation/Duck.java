package learning.vladdubceac.factory_method.product.implementation;

import learning.vladdubceac.factory_method.product.AnimalInterface;

public class Duck implements AnimalInterface {
    @Override
    public void speak() {
        System.out.println("Duck says: Mack-mack");
    }

    @Override
    public void walk() {
        System.out.println("Duck can walk");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
