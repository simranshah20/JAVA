class Dice {
    // Method to simulate rolling a dice, returns a random integer from 1 to 6
    int roll() {
        // Generate a random number between 0 (inclusive) and 6 (exclusive)
        double random = Math.random() * 6;

        // Round up to the nearest integer (1 to 6) and cast to an integer
        return (int)(Math.ceil(random));
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Dice object
        Dice dice = new Dice();

        // Roll the dice 10 times and print each result
        for (int i = 1; i <= 10; i++) {
            System.out.print(dice.roll() + " ");
        }
    }
}
