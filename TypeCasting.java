public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);
        System.out.println(myDouble);

        
        // Explicit Casting (Narrowing)
        double MyDouble2 = 7.66;
        int MyInt2 = (int) MyDouble2; // Manual casting: double to int
        System.out.println(MyDouble2);
        System.out.println(MyInt2);

    }
    //TypeCasting is the process of converting a variable 
    // from on data type to another


}
