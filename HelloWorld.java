public class HelloWorld {
    public static void main(String[] args) {
        // UC5: Display Hello with Multiple Command-Line Arguments using Enhanced For
        // Loop
        if (args.length > 0) {
            String greeting = "Hello";
            for (String name : args) {
                greeting += " " + name;
            }
            System.out.println(greeting);
        } else {
            System.out.println("Hello, World!");
        }
    }
}
