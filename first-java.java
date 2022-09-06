import java.util.Scanner;

class FirstClass {
    public static void main(String[ ] args) {
        // The Scanner object allows you to take in user data (JS Prompts)
        Scanner firstVariable = new Scanner(System.in);
        System.out.println(firstVariable.next());

        // When logging a string, you must specify a variable for it to print
        System.out.println("Great Job");

        // Basic addition
        int x = 25 + 45;
        System.out.println(x);

        // Increment operator
        int a = 5;
        ++a; // Now it's 6
        System.out.println(a);

        // Decrement operator
        int b = 5;
        --b; // Now it is 4
        System.out.println(b);

        // There is something called postfix and prefix when using the increment and decrement operators
        // This is prefixing
        int c = 5; // C is assigned to the value of 5
        int d = ++c; // Because "++" is before c, d will be assigned to the value of "c" incremented by one
        System.out.println("Assigned to c: " + c);
        System.out.println("Prefixing by 1: " + d);

        // This is postfixing
        int e = 5; // E is assigned the value of 5
        int f = e++; // Because "++" is after the e, f will only be assigned to the value of 5, THEN e will be incremented by 1
        System.out.println("Assigned to E: " + e);
        System.out.println("Postfixed by 1: " + f);

        // You can also do Assignment operators like += and -=
        int g = 5;
        int h = 10;
        g += h; // Adds g and h together and assignes it to g. (g = g + h)
        System.out.println("The value of G is now: " + g);

        // Strings must be declared with a type and use quotes.
        String i = "Hello!!";
        System.out.println("Prints the String: " + i);

        // If Else statements (They are just like JS if statements)
        int age = 30;
        if (age < 16) {
            System.out.println("Too Young");
        } else {
            System.out.println("Welcome!");
        }

        // Switch Statements:
        int day = 3;

        switch(day) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            default: 
                System.out.println("No Week yet!");
        }


    }
}