package learning.vladdubceac.factory_method.factory.implementation;

import learning.vladdubceac.factory_method.factory.AnimalFactory;
import learning.vladdubceac.factory_method.product.AnimalInterface;
import learning.vladdubceac.factory_method.product.implementation.Duck;
import learning.vladdubceac.factory_method.product.implementation.Tiger;

public class ConcreteAnimalFactory extends AnimalFactory {
    public static final String TIGER = "tiger";
    public static final String DUCK = "duck";

    @Override
    public AnimalInterface getAnimal(String animalType) throws Exception {
        if(animalType == null || animalType.isBlank()){
            throw new Exception("Not a valid animal type - "+animalType +" !");
        }

        switch (animalType.toLowerCase()){
            case TIGER: return new Tiger();
            case DUCK: return new Duck();
            default: throw new Exception("Animal type '"+animalType+"' cannot be instantiated !");
        }
    }
}
