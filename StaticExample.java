public class StaticExample {
    // Example Class
    public static class ExampleClass {
        // Static field
        public static String someStaticField = "This is static!";

        // Dynamic field
        public String someDynamicField = "This is not static!";
    }

    // Main
    public static void main(String[] args) {
        // Access the static field
        System.out.println(ExampleClass.someStaticField);

        // Access the dynamic field
        ExampleClass object = new ExampleClass(); // An object must be created first
        System.out.println(object.someDynamicField);
    }
}
