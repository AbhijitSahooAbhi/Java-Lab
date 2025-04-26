// File: animals/Animal.java
package animals;

public class AnimalPackage {
    protected String name;

    public AnimalPackage(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}
