package com.example.cw_jan_fx;

import java.util.ArrayList;

public class FoodQueue {
    private final int bugerPrice =650;
    private ArrayList<Customer> queue;
    private  ArrayList<Customer> servedCustomers ;
    private int queueSize;
    public FoodQueue(int queueSize) {
        this.queue = new ArrayList<>();
        this.queueSize =queueSize;
        this.servedCustomers=new ArrayList<>();
    }
    public int getQueueSize() {
        return this.queue.size();
    }
    private boolean queueSizeCheacker(){
        return this.queue.size() < this.queueSize;
    }
    public void addCustomer(Customer customer) {
        if (queueSizeCheacker())
            this.queue.add(customer);
        else {
            System.out.println("The queue is full Please wait");
        }

    }
    public ArrayList<Customer> getCustomers() {
        return queue;
    }
    public Customer getCustomer(int customerNumber){
        try {
            return this.queue.get(customerNumber);
        }catch (IndexOutOfBoundsException e){
            return null;
        }

    }
    public void serveaddCustomer(){
        this.servedCustomers.add(this.queue.get(0));
        this.queue.remove(0);
        System.out.println("Customer has been served.");
    }
    public boolean isQueueEmpty(){
        return this.queue.isEmpty();
    }
    public boolean isQueueFull(){
        return this.queue.size()==this.queueSize;
    }
    public void removeCoustomer(int index){
        this.queue.remove(index);
    }

    public int getIncome(){
        int total=0;

        for(Customer customer:this.queue){
            total+=customer.getBurgersRequired()*bugerPrice;
        }
        return total;
    }

}
