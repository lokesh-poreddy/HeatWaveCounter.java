class patterns7 {
    public void pattern7(int n) {
        // Outer loop controls the current row (1 up to n)
        for (int i = 1; i <= n; i++) {
            
            // 1. First inner loop prints the leading spaces
            // Row 1 gets (n-1) spaces, Row 2 gets (n-2) spaces, etc.
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // 2. Second inner loop prints the stars
            // Calculates the odd sequence of stars: 1, 3, 5, 7, 9...
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            // Move down to the next line for the next row
            System.out.println();
        }
    }
}