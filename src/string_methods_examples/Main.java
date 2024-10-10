package string_methods_examples;

public class Main {
    public static void main(String[] args) {
        //String with constructor vs string literal
        String myFirstName = new String("Tristan");
        String myLastName = "Brester";
        String anotherFirstName = new String("Tristan");
        String anotherLastName = "Brester";

        System.out.println(myFirstName == anotherFirstName);
        System.out.println(myLastName == anotherLastName);

        //to compare two objects, use the .equals() method
        System.out.println(myFirstName.equals(anotherFirstName));

        //String length
        System.out.println(myFirstName.length());

        //substring method
        System.out.println(myFirstName.substring(0,5));

        //indexOf
        System.out.println(myFirstName.indexOf("t"));

        //compareTo
        System.out.println(myFirstName.compareTo(anotherFirstName));
    }
}
