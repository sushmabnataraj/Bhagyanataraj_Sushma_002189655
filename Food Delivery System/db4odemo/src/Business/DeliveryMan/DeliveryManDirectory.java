/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> dmDirectory;
    
    public DeliveryManDirectory(){
        this.dmDirectory = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return dmDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> dmDirectory) {
        this.dmDirectory = dmDirectory;
    }
    
    public DeliveryMan createUserAccount(String name, String password, String username,String address,String phNumber){
        DeliveryMan dm = new DeliveryMan(name,password,username,address,phNumber);
        dmDirectory.add(dm);
        return dm;
    }
    
    
    //funtion to delete the DeliveryMan
    public void deleteDeliveryMan(String username){
        
        ArrayList<DeliveryMan> dman = new ArrayList<DeliveryMan>();
        for(DeliveryMan dm : dmDirectory){
            if(dm.userName.equalsIgnoreCase(username)){
                dman.add(dm);
            }
        }
        dmDirectory.removeAll(dman);
    }
    
    //function to update the DeliveryMan
    public void editDeliveryMan(String name,String userName,String password){
        for(DeliveryMan dm: dmDirectory){
            if(dm.userName.equalsIgnoreCase(userName)){
                dm.name = name;
                dm.userName = userName;
                dm.password = password;
            }
        }
    }
    
    public DeliveryMan getDeliveryMan(String userName){
        for(DeliveryMan dm: dmDirectory){
            if(dm.userName.equalsIgnoreCase(userName)){
                return dm;
            }
        }
        return null;
    }
    
}
