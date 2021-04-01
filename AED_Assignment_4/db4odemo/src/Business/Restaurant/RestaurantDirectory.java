/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantDirectory;
    private Restaurant restaurant;
    private Dishlist menu;
    
    public RestaurantDirectory(){
        this.restaurantDirectory = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant createUserAccount(String name,String userName,String password,String address,String phoneNum){
        Restaurant restaurant = new Restaurant(name,password,userName,address,phoneNum);
        restaurantDirectory.add(restaurant);
        return restaurant;
    }
    
    
    //funtion to delete the restaurant
    public void deleteRestaurant(String username){
        
        ArrayList<Restaurant> rest = new ArrayList<Restaurant>();
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.userName.equalsIgnoreCase(username)){
                rest.add(restaurant);
            }
        }
        restaurantDirectory.removeAll(rest);
    }
    
    //function to update the restaurant
    public void editRestaurant(String name,String userName,String password){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.userName.equalsIgnoreCase(userName)){
                restaurant.name = name;
                restaurant.userName = userName;
                restaurant.password = password;
            }
        }
    }
    
    public Restaurant getRestaurant(String userName){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.userName.equalsIgnoreCase(userName)){
                return restaurant;
            }
        }
        return null;
    } 
    
    public void updateRestaurantInfo(Restaurant rest, String name,String number,String address ){
         rest.setName(name);
         rest.setAddress(address);
         rest.setNumber(number);
     }
    
    public Dishlist AddMenuDishes(Restaurant rest,String name,String desc,String amount){
        menu=new Dishlist(name, desc, amount);
        rest.addFoodItem(menu);
        return menu;
    }
    
    public void DeleteDishes(Restaurant rest,Dishlist menu){
        rest.removeFoodItem(menu);
        
    }
}
