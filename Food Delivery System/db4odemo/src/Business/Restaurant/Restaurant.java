/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    
    String name;
    String password;
    String userName;
    private ArrayList<Order> orderList;
    private ArrayList<Dishlist> Menu;
    private String address;
    private String phoneNum;
    
    public Restaurant(String name,String userName,String password,String address,String phoneNum){
        this.name = name;
        this.password = password;
        this.userName = userName;
        this.phoneNum = phoneNum;
        this.address = address;
        Menu = new ArrayList<Dishlist>();
        orderList=new ArrayList<Order>();
    }

    public ArrayList<Dishlist> getMenu() {
        if(Menu==null){
            Menu = new ArrayList<Dishlist>();
        }
        return Menu;
    }

    public void setMenu(ArrayList<Dishlist> menu) {
        this.Menu = menu;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    @Override
    public String toString() {
        return name;
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

    public String getNumber() {
        return phoneNum;
    }

    public void setNumber(String number) {
        this.phoneNum = number;
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
    
    int id = 1;
      public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Dishlist> Order, String orderAmount, String address) {
        Order order=new Order();
        order.setOrderIdnum(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliveryMan(deliverMan);
        order.setOrder(Order);
        order.setOrderAmount(orderAmount);
        order.setAddress(address);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
      
      public void addFoodItem(Dishlist menu){
        Menu.add(menu);
    }
    
    public void removeFoodItem(Dishlist menu){
         Menu.remove(menu);
    }
}
