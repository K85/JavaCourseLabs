package lab8;

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest {

    public static void main(String[] args) {
        Dog dog = new Dog("Spike") {
            @Override
            public int avgBreedWeight() {
                return 120;
            }
        };
        System.out.println(dog.getName() + " says " + dog.speak());

        Dog labrador = new Labrador("labrador", "WHITE");
        System.out.println(labrador.getName() + " says " + labrador.speak());

        Dog yorkshire = new Yorkshire("yorkshire");
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());

    }

}
