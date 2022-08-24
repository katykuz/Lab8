/*
 * Ekaterina Kuznetsova
 * CPSC 5002, Seattle University
 * This is free and unencumbered software released into the public domain.
 */
package EKuznetsova1_Lab8;

/**
 * This class creates a generic stack to represent a stack of any type of
 * data; it includes the basic methods a stack class would have such as push,
 * pop, peek, empty, and toString.
 *
 * @author Ekaterina Kuznetsova
 * @version 1.0
 */
public class Stack<T>{

    /**
     The Node class is used to implement the
     linked list.
     */
    private class Node
    {
        //declare the double variable of the element
        T value;
        //declare the succeeding node
        Node next;

        /**
         * This node constructor takes in parameters for the value of the
         * element and the succeeding node.
         *
         * @param val
         * @param n
         */
        Node(T val, Node n)
        {
            //initiate the double variable and the next Node
            value = val;
            next = n;
        }
    }

    private Node top = null;  // Top of the stack

    /**
     * Stack constructor sets the top node to null and initializes the count
     * integer to zero when an instance of the class is created
     */
    public void Stack() {
        //initiate the top of the stack and the count variable
        top = null;

    }

    /**
     The empty method checks for an empty stack.
     @return true if stack is empty, false otherwise.
     */
    public boolean empty()
    {
        //return true if the list is empty, false if it is not
        return top == null;
    }

    /**
     * The push method adds a new item to the stack.
     *
     * @param number The item to be pushed onto the stack.
     */
    public void push(T number)
    {
        //set top to be a new node with the value of passed in number
        top = new Node(number, top);

    }

    /**
     * The Pop method removes the value at the top of the stack.
     *
     * @return The value at the top of the stack.
     * @throws IllegalArgumentException if the stack is empty
     */
    public T pop() throws IllegalArgumentException
    {
        //if the stack is empty, throw an exception
        if (empty())
            throw new IllegalArgumentException("Not enough numbers.");
        //if not empty
        else
        {
            //set the top value to a temporary variable
            T retValue = top.value;
            //replace top with the second to top value to remove top
            top = top.next;
            //return the removed value
            return retValue;
        }
    }

    /**
     * The peek method returns the top value on the stack.
     *
     * @return The value at the top of the stack.
     * @throws IllegalArgumentException if the stack is empty
     */
    public T peek() throws IllegalArgumentException
    {
        //if the stack is empty, throw exception
        if (empty())
            throw new IllegalArgumentException("Empty stack!");
            //otherwise, return the value at the top of the stack
        else
            return top.value;
    }

    /**
     * The toString method concatenates all strings in the stack to give a
     * string representation of the contents in the stack.
     *
     * @return string representation of this stack.
     */
    public String toString() {
        //create new StringBuilder object
        StringBuilder sBuilder = new StringBuilder();

        //create a reference p Node
        Node p = top;
        //traverse through stack and append all values
        while (p != null) {
            sBuilder.append(p.value + " ");
            //advance p reference
            p = p.next;
        }
        //return the String
        return sBuilder.toString();
    }

}

