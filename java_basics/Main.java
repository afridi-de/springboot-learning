public class Main {
	public static void main(String[] args) {
		// Your code goes here

        // Primitive Data Types in Java
        int myInt = 10; // Declare an integer variable and assign a value
        double shoeSize = 9.5; // Declare a double variable and assign a value

        char myInitial = 'A'; // Declare a char variable and assign a value

        double result = myInt * shoeSize; // Perform a calculation using the variables

        // Non Primitive Data Types in Java
        String myName = "John"; // Declare a String variable and assign a value
        
        myName.length(); // Get the length of the String

        System.out.println("My initial is: " + myInitial); // Print the value of myInitial

        System.out.println("The value of myInt is: " + myInt); // Print the value of myInt

        System.out.println("The value of shoeSize is: " + shoeSize); // Print the value of shoeSize

        System.out.println("The result of the calculation is: " + result); // Print the result of the calculation

        System.out.println("My name is: " + myName.toUpperCase()); // Print the name in uppercase

        //Calling methods in java
        burp(); // Call the burp method

        //Calling method with parameter
        greet("John"); 

        //Calling method with multiple parameters
        addNumbers(5, 10);

        //Calling method with return type
        String greeting = getGreeting("Alice");
        System.out.println(greeting);

        // Conditional Statements in Java
        
        if (myName.equals("John")) {
            // Code when condition1 is true
            System.out.println("This guy is awesome");
        } else if (myName.equals("Larry")) {
            // Code when condition2 is true
            System.out.println("This guy is ok i guess");
        } else {
            // Code when no conditions are true
            System.out.println("I don't know this person");
        }

        // Basic arithmetic operators in Java:
        // + addition
        // - subtraction
        // * multiplication
        // / division
        // % modulus (remainder)
        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to
        // == equal to
        // != not equal to

        // Loops in Java
        for (int i = 0; i < 10; i++) {
            System.out.println("This is loop iteration: " + i);
        }

        // Object-Oriented Programming (OOP) in Java

        Cat.dingDong(); // Call the static method dingDong from the Cat class

        // Creating a cat object using the Cat class
        Cat myCat = new Cat(); 
        myCat.name = "Whiskers"; // Set the name of the cat
        myCat.age = 3; // Set the age of the cat

        myCat.meow(); // Call the meow method on the cat object

        Cat anotherCat = new Cat(); // Create another cat object
        anotherCat.name = "Fluffy"; // Set the name of the second cat
        anotherCat.age = 2; // Set the age of the second cat

        anotherCat.meow(); // Call the meow method on the second cat object
        // meow method is not static, so it can only be called on an instance of the Cat class (i.e., an object of the Cat class).
        
	}

    // Methods in java
    private static void burp() {
        System.out.println("Burp!");
    }

    // Method with parameter
    private static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with multiple parameters
    private static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    // Method with return type
    private static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}

