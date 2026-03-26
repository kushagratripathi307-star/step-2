public class HelloWorld {
    public static void main(String[] args) {
        // UC6: Display Hello with Multiple Command-Line Arguments using substring to
        // Remove Trailing Delimiter
        if (args.length > 0) {
            String greeting = "Hello ";
            for (String name : args) {
                greeting += name + ", ";
            }
            // Remove the trailing delimiter
            greeting = greeting.substring(0, greeting.length() - 2);
            System.out.println(greeting + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
