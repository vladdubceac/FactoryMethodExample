package learning.vladdubceac.factory_method.client;

import learning.vladdubceac.factory_method.factory.AnimalFactory;
import learning.vladdubceac.factory_method.factory.implementation.ConcreteAnimalFactory;
import learning.vladdubceac.factory_method.product.AnimalInterface;

public class Client {

    public static void main(String[] args) throws Exception {
	// write your code here
        AnimalFactory animalFactory = new ConcreteAnimalFactory();

        AnimalInterface animal1 = animalFactory.getAnimal("tiger");
        animal1.speak();
        animal1.fly();
        animal1.swim();
        animal1.walk();

        AnimalInterface animal2 = animalFactory.getAnimal("duck");
        animal2.walk();
        animal2.swim();
        animal2.fly();
        animal2.speak();

        AnimalInterface animal3 = animalFactory.getAnimal("dog");
        animal3 = animalFactory.getAnimal(" ");
        animal3 = animalFactory.getAnimal(null);
    }
}
