package MiniProjects.OnlineShoppingSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer {

    Customer(String name, String address, String phoneNumber, String email, String Gender/* M/F */){
        HashMap<String,String> customerDetails =new HashMap<String,String>();//Creating HashMap  
        customerDetails.put("name", name);
        customerDetails.put("address", address);
        customerDetails.put("phoneNumber", phoneNumber);
        customerDetails.put("email", email);
        customerDetails.put("Gender", Gender);
        
        ArrayList arrayList = new ArrayList<>();


    }  

    public void addToCart(){
        


    }

    public void viewProduct(){
        
    }

    
}
