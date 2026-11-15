public class JvConstructor {
    public static void main(String[] args) {

        Dog myDog = new Dog(); // Dog() is the default constructor.

        Dog strayDog = new Dog("Buddy", 3); // Dog() is the constructor.


        // Java creates a default constructor if you don't define any constructor in your class. 
        // The dafault contructor does not take any arguments.

        System.out.println("The name of the dog is: " + strayDog.name);
        System.out.println("The age of the dog is: " + strayDog.age);

        // If no constructor is defined in the class, Java automatically provides a default constructor.
        // However, if you define any constructor (like the one above), the default constructor is not provided.
        // default construcor can be added to class definition.

        System.out.println("The name of the dog is: " + myDog.name);
        System.out.println("The age of the dog is: " + myDog.age);

        // Calling Constructor less class

        // Accessing the constant MY_NAME from the Constants class
        System.out.println(Constants.MY_NAME); 

        // Trying to create an instance of the Constants class will result in a compilation error because the constructor is private.
        // Constants constants = new Constants();
    }
}
