public class DefaultValues {
    // Declare instance variables for each primitive data type
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public static void main(String[] args) {
        // Create an object of the class to access instance variables
        DefaultValues obj = new DefaultValues();

        // Display the default values of each primitive data type
        System.out.println("Default value of byte: " + obj.defaultByte);
        System.out.println("Default value of short: " + obj.defaultShort);
        System.out.println("Default value of int: " + obj.defaultInt);
        System.out.println("Default value of long: " + obj.defaultLong);
        System.out.println("Default value of float: " + obj.defaultFloat);
        System.out.println("Default value of double: " + obj.defaultDouble);
        System.out.println("Default value of char: '" + obj.defaultChar + "'");
        System.out.println("Default value of boolean: " + obj.defaultBoolean);
    }
}
OUT PUT:
Default value of byte: 0
Default value of short: 0
Default value of int: 0
Default value of long: 0
Default value of float: 0.0
Default value of double: 0.0
Default value of char: ' '
Default value of boolean: false