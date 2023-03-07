/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_management;

/**
 *
 * @author USER
 */
public class Items_fetch {
     private String item_name, item_id;
    private Integer quantity;
    private Double selling_rate,purchase_rate;
    
    public Items_fetch(String item_id, String item_name,Integer quantity,Double purchase_rate,Double selling_rate){
        this.item_id = item_id;
        this.item_name=item_name;
        this.quantity= quantity;
        this.purchase_rate= purchase_rate;
        this.selling_rate = selling_rate;
    }
    public String getitem_name(){
        return item_name;
    }
    public String getitem_id(){
        return item_id;
    } 
    public Integer getquantity(){
        return quantity;
    }
    public Double getpurchase_rate(){
        return purchase_rate;
    }
    public Double getselling_rate(){
        return selling_rate;
    }
}
