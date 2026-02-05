public class strings {
    public static void main(String[] args) {
        // Strings in Java are objects that represent sequences of characters. 
        // They are used to store and manipulate text. 
        // Strings are immutable, meaning that once a String object is created, it cannot be changed.

        String greeting = "Hello, World!";
        System.out.println(greeting);

        // Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // String Methods
        String message = "Welcome to Java programming!";
        System.out.println("Length of message: " + message.length());
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());
        System.out.println("Substring: " + message.substring(11, 15));
    }

}
