public class Main {
    public static void main(String[] args) {

        /*wrapper class = provides a way to use primitive data types as reference data types
                        reference data types contain useful methods
                        can be used with collections (ex.ArrayList)

        primitive         wrapper
        ---------         ---------
        boolean            Boolean
        char               Character
        int                Integer
        double       -      Double

        autoboxing = the automatic conversion that the Java compiler makes between the primitive data types and their corresponding object wrapper classes
        unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
         */

        Boolean a = true;
        Character b = '#';
        Integer c = 567;
        Double d = 5.67;
        String e = "Kimtai";

        if (a==true){
            System.out.println("This is true");
        }

    }}


