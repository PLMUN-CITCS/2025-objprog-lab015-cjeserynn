public class VariableScope {

    // Global variable
    static int globalCount = 100;

    // Main method
    public static void main(String[] args) {
        // Print globalCount in main
        System.out.println("Global Count (from main): " + globalCount);

        // Call showScope method
        showScope();
    }

    // Method to show scope of variables
    public static void showScope() {
        int localCount = 50; // Local variable
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
