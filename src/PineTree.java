public class PineTree {
    public static void main(String[] args) {
        int treeHeight = 7; // Adjust the height of the tree here

        // Print the tree
        printTree(treeHeight);
    }

    public static void printTree(int height) {
        // Print the leaves
        for (int i = 0; i < height; i++) {
            // Print spaces before the asterisks
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Print the trunk
        for (int i = 0; i < 2; i++) {
            // Print spaces before the trunk
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            // Print the trunk
            System.out.println("*");
        }
    }
}
///  Print pine tree using asterisks in the console.