package com.example.cw_jan_fx;

import java.util.ArrayList;


public class WaitingQueue {
    private ArrayList<Customer> queue;

    public WaitingQueue() {
        // Constructor: Initializes an empty queue
        this.queue = new ArrayList<>();
    }
    public boolean isEmpty() {
        // Checks if the queue is empty
        return queue.isEmpty();
    }
    public void add(Customer item) {
        // Adds an item to the end of the queue
        this.queue.add(item);
    }
    public Customer get() {
        if (isEmpty()) {
            // If the queue is empty, cannot dequeue an item
            System.out.println("Waiting Queue is empty.");
            return null;
        }

        // Removes and returns the first item from the queue
        Customer item = this.queue.remove(0);
        return item;
    }
    public ArrayList<Customer> getCustomers() {
        return this.queue;
    }
}