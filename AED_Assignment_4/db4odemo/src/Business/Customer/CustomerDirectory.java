/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer createUserAccount(String name,String userName,String password,String address,String phoneNum){
        Customer customer = new Customer(name,password,userName,address,phoneNum);
        customerDirectory.add(customer);
        return customer;
    }
    
    
    //funtion to delete the customer
    public void deleteCustomer(String username){
        
        ArrayList<Customer> cust = new ArrayList<Customer>();
        for(Customer custmr: customerDirectory){
            if(custmr.userName.equalsIgnoreCase(username)){
                cust.add(custmr);
            }
        }
        customerDirectory.removeAll(cust);
    }
    
    //function to update the customer
    public void editCustomer(String name,String userName,String password){
        for(Customer custmr: customerDirectory){
            if(custmr.userName.equalsIgnoreCase(userName)){
                custmr.name = name;
                custmr.userName = userName;
                custmr.password = password;
            }
        }
    }
    
    public Customer getCustomer(String userName){
        for(Customer custmr: customerDirectory){
            if(custmr.userName.equalsIgnoreCase(userName)){
                return custmr;
            }
        }
        return null;
    }    
    
}
