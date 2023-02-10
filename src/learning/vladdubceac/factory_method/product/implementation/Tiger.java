package learning.vladdubceac.factory_method.product.implementation;


import learning.vladdubceac.factory_method.product.AnimalInterface;

public class Tiger implements AnimalInterface {
    @Override
    public void speak() {
        System.out.println("Tiger says: Halum - halum");
    }

    @Override
    public void walk() {
        System.out.println("Tiger can walk");
    }

    @Override
    public void fly() {
        System.out.println("Tiger cannot fly");
    }

    @Override
    public void swim() {
        System.out.println("Tiger can swim");
    }
}
