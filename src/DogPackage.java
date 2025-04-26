// File: mammals/Dog.java
package mammals;

import animals.AnimalPackage;

public class DogPackage extends AnimalPackage {

    public DogPackage(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}
