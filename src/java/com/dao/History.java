package com.dao;
// Generated 10.06.2015 1:54:26 by Hibernate Tools 4.3.1

/**
 * History generated by hbm2java
 */
public class History  implements java.io.Serializable {


     private int id;
     private String user;
     private String product;
     private String buydate;
     private String address;

    public History() {
    }

	
    public History(int id, String product, String buydate, String address) {
        this.id = id;
        this.product = product;
        this.buydate = buydate;
        this.address = address;
    }
    public History(int id, String user, String product, String buydate, String address) {
       this.id = id;
       this.user = user;
       this.product = product;
       this.buydate = buydate;
       this.address = address;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }
    public String getBuydate() {
        return this.buydate;
    }
    
    public void setBuydate(String buydate) {
        this.buydate = buydate;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }




}


