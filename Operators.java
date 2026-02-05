public class Operators{
    public static void main(String[] args){
       // Java has various types of operators, including:
       // Arithmetic Operators: +, -, *, /, %, ++, --
         // Assignment Operators: =, +=, -=, *=, /=, %=
         // Comparison Operators: ==, !=, >, <, >=, <=
            // Logical Operators: &&, ||, !
               // Bitwise Operators: &, |, ^, ~, <<, >>, >>>
                  // Ternary Operator: ? :
                     // instanceof Operator: tests whether an object is an instance of a specific class or implements a specific interface.
        //Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.

        int x = 10* 6;
        System.out.println("Multiplication Operator: " + x);

        int y = 10 + 6;
        System.out.println("Addition Operator: " + y);

        int z = 10 % 6;
        System.out.println("Modulus Operator: " + z);

        int a = 10/2;
        System.out.println("Division Operator: " + a);

        int b = 10 - 6;
        System.out.println("Subtraction Operator: " + b);

        int c = 5;
        c++;
        System.out.println("Increment Operator: " + c);

        // && Logical AND operator

        int d = 4;
        System.out.println(d < 5 && d < 15);

        int e = 4;
        System.out.println(e < 5 || e < 3);

        

    }
}