public class HelloWorld {
    public static void main(String[] args) {
        // UC3: Display Hello with Command-Line Argument or Default Message
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello World");
        }
    }
}
