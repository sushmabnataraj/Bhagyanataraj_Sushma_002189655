/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Restaurant.Dishlist;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    String name;
    String password;
    String userName;
    private ArrayList<Order> orderList;
    private String address;
    private String phNumber;
    
    public DeliveryMan(String name,String userName,String password,String address,String phNumber){
        this.name = name;
        this.password = password;
        this.userName = userName;
        this.address = address;
        this.phNumber = phNumber;
        orderList = new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
     public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Dishlist> Order, String orderAmount, String address) {
        Order order=new Order();
        
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliveryMan(deliverMan);
        order.setOrder(Order);
        order.setOrderAmount(orderAmount);
        order.setAddress(address);
        order.setStatus("New Order");
        orderList.add(order);
        
    }
    
}
