package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Stack;

public class LinkedStack<E> implements Stack<E> {

    /**
     * Adds the provided item to the top of the stack. Note that if the item is
     * null, nothing occurs.
     *
     * @param element Element added to the top of the stack, unless this item is
     * null.
     */
    @Override
    public void push(Object element) {

    }

    /**
     * Returns the value of the top item in the stack, without removing it. If
     * the stack is empty then null is returned.
     *
     * @return The value of the item at the top of the stack, or null if the
     * stack is empty.
     */
    @Override
    public E peek() {
        return null;
    }

    /**
     * Removes the top item from the stack and returns it's value. If the stack
     * is currently empty, null is returned.
     *
     * @return The value of the top item in the stack, or null if the stack is
     * empty.
     */
    @Override
    public E pop() {
        return null;
    }

    /**
     * @return The current number of items in this stack.
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * A test to determine if this Stack is currently empty.
     *
     * @return True if this stack is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Tranfers the contents of this stack into the provided stack. The contents
     * of this stack are to found in reverse order at the top of the provided
     * stack. This stack should be empty once the transfer is completed. Note
     * that if the provided stack is null, nothing is to happen.
     *
     * @param to The new stack onto which the reversed order of contents from
     * this stack are to be transferred to the top of, unless the provided stack
     * is null.
     */
    @Override
    public void transfer(Stack to) {

    }

    /**
     * Reverses the contents of this stack.
     */
    @Override
    public void reverse() {

    }

    /**
     * Merges the contents of the provided stack onto the bottom of this stack.
     * The order of both stacks must be preserved in the order of this stack
     * after the method call. Furthermore, the provided stack must still contain
     * its original contents in their original order after the method is
     * complete. If the provided stack is null, no changes should occur.
     *
     * @param other Stack whose contents are to be merged onto the bottom of
     * this stack.
     */
    @Override
    public void merge(Stack other) {

    }

    /**
     * Prints the contents of the stack starting at top, one item per line. Note
     * this method should not empty the contents of the stack.
     */
    @Override
    public void printStack() {

    }
}
