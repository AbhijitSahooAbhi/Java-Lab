import mammals.DogPackage;
public class MainPackage {
    public static void main(String[] args) {
        DogPackage myDog = new DogPackage("Buddy");
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method from Dog
    }
}
