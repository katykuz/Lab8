/*
 * Ekaterina Kuznetsova
 * CPSC 5002, Seattle University
 * This is free and unencumbered software released into the public domain.
 */
package EKuznetsova1_Lab8;

/**
 * Lab8 class is responsible for testing the generic Queue and Stack classes
 * with doubles and Strings as the 'payload' for each; it includes the main
 * method and calls the necessary methods for testing.
 *
 * @author Ekaterina Kuznetsova
 * @version 1.0
 */
public class Lab8 {

    /**
     * The main method includes the main method, calls the four testing methods
     * for generic stacks and queues, prints a goodbye message.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        //print welcome message
        welcome();

        //call the test methods for queues and stacks with doubles and strings:
        testQueueDouble();
        testStackDouble();
        testQueueString();
        testStackString();

        //print goodbye message
        goodbye();
    }

    /**
     * Welcome method welcomes the user and introduces the program
     */
    public static void welcome() {
        //create welcome string
        String welcome = "Welcome to the testing program!";
        //print string in middle of 80 characters
        System.out.printf("%13s\n", welcome);
        //print message
        System.out.println("This program demonstrates the functionality of" +
                " generic \nQueue and Stack classes with double and String " +
                "data types." );
    }

    /**
     * goodbye method prints a farewell message and thanks the user
     */
    public static void goodbye() {
        //print goodbye message
        System.out.println("\nThanks for testing! Goodbye for now!");
    }

    /**
     * The testQueueDouble method demonstrates the functionality of the
     * constructor, the enqueue, dequeue, peek, empty, and toString methods
     * for double data type.
     */
    public static void testQueueDouble(){
        //ctor test - create a queue object
        Queue<Double> queueDouble = new Queue<Double>();

        //print label of test
        System.out.println("\nQUEUE DOUBLE TEST:");
        System.out.println("-----------------");
        //enqueue test with pi, Euler's number, and the golden ratio
        System.out.print("Let's enqueue pi, Euler's number, and the Golden\n" +
                        "ratio to the queue: ");
        //enqueue pi
        queueDouble.enqueue(3.1415);
        //enqueue Euler's number
        queueDouble.enqueue(2.7182);
        //enqueue Golden ratio
        queueDouble.enqueue(1.6180);
        //using the toString method, print contents of the queue
        System.out.println(queueDouble);

        //peek test with pi
        System.out.print("\nLet's peek at pi, head value: ");
        //peek test of head value
        System.out.println(queueDouble.peek());

        //print message to standard output
        System.out.print("\nAfter dequeue-ing the Golden ration, we can peek" +
                " at\nEuler's number: ");
        //dequeue test
        queueDouble.dequeue();
        //peek at the head value
        System.out.println(queueDouble.peek());

        //print message to standard output
        System.out.print("\nAfter dequeue-ing Euler's number, we can test" +
                " the\nempty method, which should return false since the " +
                "Golden \nratio is still on the queue: ");

        //dequeue the head value
        queueDouble.dequeue();
        //empty test will print false since pi is still on the queue
        System.out.println(queueDouble.empty());
    }

    /**
     * The testStackDouble method demonstrates the functionality of the
     * constructor, the push, pop, peek, empty, and toString methods
     * for double data type.
     */
    public static void testStackDouble(){
        //ctor test - create a stack object
        Stack<Double> stackDouble = new Stack<Double>();

        //print label of test
        System.out.println("\nSTACK DOUBLE TEST:");
        System.out.println("-----------------");
        //push test with pi, Euler's number, and the golden ratio
        System.out.print("Let's push pi, Euler's number, and the Golden\n" +
                "ratio to the queue: ");
        //push pi
        stackDouble.push(3.1415);
        //push Euler's number
        stackDouble.push(2.7182);
        //push Golden ratio
        stackDouble.push(1.6180);
        //using the toString method, print contents of the stack
        System.out.println(stackDouble);

        //peek test with the golden ratio
        System.out.print("\nLet's peek at the Golden ratio, top value: ");
        //peek test of head value
        System.out.println(stackDouble.peek());

        //print message to standard output
        System.out.print("\nAfter pop-ing the Golden ration, we can peek " +
                "at\nEuler's number: ");
        //pop test
        stackDouble.pop();
        //peek at the top value
        System.out.println(stackDouble.peek());

        //print message to standard output
        System.out.print("\nAfter pop-ing Euler's number, we can test " +
                "the\nempty method, which should return false since pi is " +
                "still \non the queue: ");

        //pop the top value
        stackDouble.pop();
        //empty test will print false since pi is still on the stack
        System.out.println(stackDouble.empty());
    }

    /**
     * The testQueueString method demonstrates the functionality of the
     * constructor, the enqueue, dequeue, peek, empty, and toString methods
     * for String objects.
     */
    public static void testQueueString(){
        //ctor test - create a queue object
        Queue<String> queueString = new Queue<String>();

        //print label of test
        System.out.println("\nQUEUE STRING TEST:");
        System.out.println("-----------------");
        //push test with HELLO, HOLA, and BONJOUR
        System.out.println("Let's enqueue \"HELLO\", \"HOLA\", and " +
                "\"BONJOUR\" \nto the stack: ");
        //enqueue "Hello"
        queueString.enqueue("HELLO");
        //enqueue "HOLA"
        queueString.enqueue("HOLA");
        //enqueue "BONJOUR"
        queueString.enqueue("BONJOUR");
        //using the toString method, print contents of the queue
        System.out.println(queueString);

        //peek test with HELLO
        System.out.print("\nLet's peek at \"HELLO\", head value: ");
        //peek test of head value
        System.out.println(queueString.peek());

        //print message to standard output
        System.out.print("\nAfter dequeue-ing \"HELLO\", we can peek" +
                "at \"HOLA\": ");
        //dequeue test
        queueString.dequeue();
        //peek at the head value
        System.out.println(queueString.peek());

        //print message to standard output
        System.out.print("\nAfter dequeue-ing \"HOLA\", we can test " +
                "the empty method,\nwhich should return false since " +
                "\"BONJOUR\" is still \non the queue: ");

        //dequeue the head value
        queueString.dequeue();
        //empty test will print false
        System.out.println(queueString.empty());
    }

    /**
     * The testStackString method demonstrates the functionality of the
     * constructor, the push, pop, peek, empty, and toString methods
     * for String objects.
     */
    public static void testStackString(){
        //ctor test - create a stack object
        Stack<String> stackString = new Stack<String>();

        //print label of test
        System.out.println("\nSTACK STRING TEST:");
        System.out.println("-----------------");
        //push test with HELLO, HOLA, and BONJOUR
        System.out.println("Let's push \"HELLO\", \"HOLA\", and \"BONJOUR\"" +
                " to the stack:");
        //push "Hello"
        stackString.push("HELLO");
        //push "HOLA"
        stackString.push("HOLA");
        //push "BONJOUR"
        stackString.push("BONJOUR");
        //using the toString method, print contents of the stack
        System.out.println(stackString);

        //peek test with BONJOUR
        System.out.print("\nLet's peek at \"BONJOUR\": ");
        //peek test of top value
        System.out.println(stackString.peek());

        //print message to standard output
        System.out.print("\nAfter pop-ing \"BONJOUR\", we can peek " +
                "at \"HOLA\": ");
        //pop test
        stackString.pop();
        //peek at the top value
        System.out.println(stackString.peek());

        //print message to standard output
        System.out.print("\nAfter pop-ing \"HOLA\", we can test " +
                "the empty method,\nwhich should return false since " +
                "\"HELLO\" is still \non the queue: ");

        //pop the top value
        stackString.pop();
        //empty test will print false
        System.out.println(stackString.empty());
    }

}
