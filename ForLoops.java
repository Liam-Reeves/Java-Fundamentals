public class ForLoops{
    public static void main(String[] args){
        // ====== 1. TRADITIONAL FOR LOOP ======
        System.out.println("=== 1. TRADITIONAL FOR LOOP ===");
        System.out.println("Syntax: for(initialization; condition; increment) { }");
        
        for(int i = 0; i < 5; i++){
            System.out.println("Iteration: " + i);
        }
        
        // Traditional for loop with custom increment
        System.out.println("\nCounting by 2s:");
        for(int i = 0; i < 10; i += 2){
            System.out.println(i);
        }
        
        // Descending loop
        System.out.println("\nDescending loop:");
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }
        
        // Multiple variables
        System.out.println("\nMultiple variables:");
        for(int i = 0, j = 10; i < 5; i++, j--){
            System.out.println("i: " + i + ", j: " + j);
        }
        
        
        // ====== 2. ENHANCED FOR LOOP (FOR-EACH) ======
        System.out.println("\n=== 2. ENHANCED FOR LOOP (FOR-EACH) ===");
        System.out.println("Syntax: for(datatype variable : array/collection) { }");
        System.out.println("Used for iterating through arrays and collections without index");
        
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array iteration:");
        for(int num : numbers){
            System.out.println("Number: " + num);
        }
        
        // Enhanced for loop with String array
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("\nString array iteration:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        
        
        // ====== 3. NESTED FOR LOOPS ======
        System.out.println("\n=== 3. NESTED FOR LOOPS ===");
        System.out.println("Loops inside loops - useful for 2D arrays and patterns");
        
        // 2D array iteration
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("2D Array (Matrix):");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Pattern example: Multiplication table
        System.out.println("\nMultiplication Table (5x5):");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        
        // Triangle pattern
        System.out.println("\nTriangle Pattern:");
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        // ====== 4. LOOP CONTROL STATEMENTS ======
        System.out.println("\n=== 4. LOOP CONTROL STATEMENTS ===");
        
        // BREAK statement
        System.out.println("Using break (exit loop early):");
        for(int i = 0; i < 10; i++){
            if(i == 5){
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println(i);
        }
        
        // CONTINUE statement
        System.out.println("\nUsing continue (skip iteration):");
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + i);
        }
        
        // Labeled break (break out of nested loop)
        System.out.println("\nLabeled break (exit nested loop):");
        outerLoop: for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 1 && j == 1){
                    System.out.println("Breaking out of nested loops at i=" + i + ", j=" + j);
                    break outerLoop;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        
        // ====== 5. COMPARISON: WHEN TO USE EACH ======
        System.out.println("\n=== 5. WHEN TO USE EACH ===");
        System.out.println("Traditional for loop: Need index, custom increment, or early exit");
        System.out.println("Enhanced for loop: Iterate through entire collection, don't need index");
        System.out.println("While loop: Condition-based, not index-based");
        System.out.println("Do-while loop: Execute at least once, then check condition");
    }
}