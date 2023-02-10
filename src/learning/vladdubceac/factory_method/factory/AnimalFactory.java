package learning.vladdubceac.factory_method.factory;

import learning.vladdubceac.factory_method.product.AnimalInterface;

public abstract class AnimalFactory {
    public abstract AnimalInterface getAnimal(String animalName) throws Exception;
}
