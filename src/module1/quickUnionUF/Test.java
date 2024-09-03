package module1.quickUnionUF;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Create a QuickUnionUF object with 10 elements (0 through 9)
        QuickUnionUF qu = new QuickUnionUF(10);

        // Perform some union operations
        qu.union(4, 3); // Connect 4 and 3
        qu.union(3, 8); // Connect 3 and 8 (which also connects 4 to 8)
        qu.union(6, 5); // Connect 6 and 5
        qu.union(9, 4); // Connect 9 and 4 (which connects 9 to 8 as well)
        qu.union(2, 1); // Connect 2 and 1

        // Check if certain elements are connected
        System.out.println("Checking connections");
        System.out.println("Connected(8, 9): " + qu.connected(8, 9)); // Should print true
        System.out.println("Connected(5, 4): " + qu.connected(5, 4)); // Should print false

        // Perform additional union operations
        qu.union(5, 0); // Connect 5 and 0
        qu.union(7, 2); // Connect 7 and 2
        qu.union(6, 1); // Connect 6 and 1 (which connects 0 and 1 as well)
        System.out.println(Arrays.toString(qu.id));
        qu.union(7, 3); // Connect 7 and 3 (which connects 2 to 8 as well)

        // Check the final state of connections
        System.out.println("Connected(0, 7): " + qu.connected(0, 7)); // Should print true
    }

}
