class BreakAndContinue {
    public static void main(String[] args) {
        // This section demonstrates the usage of `break`:
        // The loop starts from 1 and goes up to 1000 (not inclusive).
        // When `i` equals 101, the `break` statement terminates the loop.
        // So, only numbers from 1 to 100 will be printed.

        System.out.println("Before Loop (with break): ");
        for (int i = 1; i < 1000; i++) {
            if (i == 101) {
                break;  // Terminates the loop when i equals 101
            }
            System.out.print(i + " ");
        }
        System.out.println("\nOut of loop (with break): ");

        // This section demonstrates the usage of `continue`:
        // The loop starts from 1 and goes up to 20 (not inclusive).
        // When `i` equals 10, the `continue` statement skips the rest of the loop body,
        // so 10 will not be printed.

        System.out.println("Before Loop (with continue): ");
        for (int i = 1; i < 20; i++) {
            if (i == 10) {
                continue;  // Skips the one iteration i.e i = 10
            }
            System.out.print(i + " ");
        }
        System.out.println("\nOut of loop (with continue): ");
    }
}
