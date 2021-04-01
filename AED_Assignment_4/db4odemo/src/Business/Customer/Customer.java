/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Dishlist;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
   
    
    String name;
    String password;
    String userName;
    private ArrayList<Order> orderList;
    private String address;
    private String phoneNum;
    
    public Customer(String name,String userName,String password,String address,String phoneNum){
        this.name = name;
        this.password = password;
        this.userName = userName;
        this.phoneNum = phoneNum;
        this.address = address;
        orderList=new ArrayList<Order>();
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    int orderId = 1;
    public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Dishlist> Order, String price, String deliveryAddress) {
        Order order=new Order();
        order.setOrderIdnum(String.valueOf(orderId));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliveryMan(deliverMan);
        order.setOrder(Order);
        order.setOrderAmount(price);
        order.setAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        orderId++;
    }
    
    
}
