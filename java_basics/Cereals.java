// This file defines an enum named Cereals.
// An enum is a special Java type that represents a fixed set of constants.
// In this example, a cereal can only be one of the values listed below.
public enum Cereals {

    // Each enum constant is a value in the enum.
    // The number inside parentheses is passed to the enum constructor.
    // Example: CAPTAIN_CRUNCH(50) creates a Cereals object with value 50.
    CAPTAIN_CRUNCH(50),
    FROOT_LOOPS(60),
    REESEES_PUFFS(100),
    COCOA_PUFFS(75);

    // This field is stored inside each enum constant.
    // It holds the numeric value associated with that cereal.
    // For example, CAPTAIN_CRUNCH has a value of 50.
    final int levelOfDeliciousness;

    // This is the constructor for the enum.
    // It is called automatically when each enum constant is created.
    // The value passed in is assigned to the field above.
    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}