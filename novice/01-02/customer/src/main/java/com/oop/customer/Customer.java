package com.oop.customer;

/**
 * Customer
 */
public class Customer {

    private String place_order;
    private String knows_name;
    private String knows_address;
    private String knows_customer_number;
    private String order_history;

    public Customer(String knows_name, String knows_address) {
        this.knows_name = knows_name;
        this.knows_address = knows_address;
    }

    public void order(Order order){
        order.orderItemDetail();
    }
}