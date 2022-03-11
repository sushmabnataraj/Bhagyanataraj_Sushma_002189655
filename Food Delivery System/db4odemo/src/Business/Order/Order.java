/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Dishlist;
import java.util.ArrayList;

/**
 *
 * @author sushm
 */
public class Order {
    
    private String orderIdnum;
    private String restaurantName;
    private String customerName;
    private String deliveryMan;
    private ArrayList<Dishlist> Order;
    private String orderAmount;
    private String status;
    private String address; 
    

    public String getOrderIdnum() {
        return orderIdnum;
    }

    public void setOrderIdnum(String orderIdnum) {
        this.orderIdnum = orderIdnum;
    }
    
    @Override
    public String toString() {
        return orderIdnum;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public ArrayList<Dishlist> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<Dishlist> Order) {
        this.Order = Order;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
}
