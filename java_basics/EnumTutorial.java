public class EnumTutorial {
    
    public static void main(String[] args) {
       
        // Create an instance of the enum
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;

        // Using enum for comparison
        if (day == DaysOfTheWeek.THURSDAY){
            System.out.println("Yay! It's almost Friday!");
        }

        DaysOfTheWeek.values(); // Returns an array of all enum constants

        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }

        // CEREALS ENUM
        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness); 
    }
}
