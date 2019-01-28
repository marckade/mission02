package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.List;
import edu.isu.cs.cs3308.structures.Node;

public class DoublyLinkedList<E> implements List<E> {

    protected Node<E> head;

    protected Node<E> tail;

    protected int size = 0;

    /**
     * @return first element in the list or null if the list is empty.
     */
    @Override
    public E first() {

        if(head == null)
        {
            return null;
        }

        return head.getData();
    }

    /**
     * @return last element in the list or null if the list is empty.
     */
    @Override
    public E last() {

        if(size > 0)
        {
            return tail.getData();
        }
        else
        {
            return null;
        }
    }

    /**
     * Adds the provided element to the end of the list, only if the element is
     * not null.
     *
     * @param element Element to be added to the end of the list.
     */
    @Override
    public void addLast(E element) {

        if(size > 0)
        {
            if(element == null)
            {
                // Do nothing as the element is null.
            }
        }
        else
        {
            Node<E> newNode = new Node<>(element);
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;

            size++;
        }

    }

    /**
     * Adds the provided element to the front of the list, only if the element
     * is not null.
     *
     * @param element Element to be added to the front of the list.
     */
    @Override
    public void addFirst(E element) {

        if(element == null)
        {
            //Do nothing
        }
        else
        {
            Node<E> newNode = new Node<>(element);
            newNode.setPrevious(null);
            newNode.setNext(head);

            //Set previous of old head to new Node.
            head.setPrevious(newNode);
            head = newNode;

            //Checks if the addFirst was the first element ot be added. If so, set tail.
            if(size == 0)
            {
                tail = newNode;
            }

            size++;

        }

    }

    /**
     * Removes the element at the front of the list.
     *
     * @return Element at the front of the list, or null if the list is empty.
     */
    @Override
    public E removeFirst() {

        if(size > 0)
        {
            // Created tempNode variable to store new head temporarily.
            Node<E> tempNode;

            // the new head is in the tempNode variable.
            tempNode = head.getNext();

            //Sets tempnodes previous to old heads previous.
            tempNode.setPrevious(head.getPrevious());

            // Sets next and previous of current head to null which should leave for garbage collection.
            head.setNext(null);
            head.setPrevious(null);

            // Sets new head to the tempNode;
            head = tempNode;

            size--;

            return head.getData();
        }

        return null;
    }

    /**
     * Removes the element at the end of the list.
     *
     * @return Element at the end of the list, or null if the list is empty.
     */
    @Override
    public E removeLast() {
        return null;
    }

    /**
     * Inserts the given element into the list at the provided index. The
     * element will not be inserted if either the element provided is null or if
     * the index provided is less than 0. If the index is greater than or equal
     * to the current size of the list, the element will be added to the end of
     * the list.
     *
     * @param element Element to be added (as long as it is not null).
     * @param index Index in the list where the element is to be inserted.
     */
    @Override
    public void insert(E element, int index) {

    }

    /**
     * Removes the element at the given index and returns the value.
     *
     * @param index Index of the element to remove
     * @return The value of the element at the given index, or null if the index
     * is greater than or equal to the size of the list or less than 0.
     */
    @Override
    public E remove(int index) {
        return null;
    }

    /**
     * Retrieves the value at the specified index. Will return null if the index
     * provided is less than 0 or greater than or equal to the current size of
     * the list.
     *
     * @param index Index of the value to be retrieved.
     * @return Element at the given index, or null if the index is less than 0
     * or greater than or equal to the list size.
     */
    @Override
    public E get(int index) {
        return null;
    }

    /**
     * @return The current size of the list. Note that 0 is returned for an
     * empty list.
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * @return true if there are no items currently stored in the list, false
     * otherwise.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Prints the contents of the list each item on its own line
     */
    @Override
    public void printList() {

    }
}
