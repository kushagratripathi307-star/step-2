public class HelloWorld {
    public static void main(String[] args) {
        // UC4: Display Hello with Multiple Command-Line Arguments or Default Message
        if (args.length > 0) {
            System.out.println("Hello " + String.join(" ", args));
        } else {
            System.out.println("Hello World");
        }
    }
}
