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
public class Transaction_fetch {
    
    private String order_no, order_date, item_name, item_id,in_out,client_name;
    private Integer quantity;
    private Double tot_amt;
    
    public Transaction_fetch(String order_no, String order_date, String item_name, String item_id,String in_out,String client_name,Integer quantity,Double tot_amt){
        this.order_no= order_no;
        this.order_date= order_date;
        this.item_name=item_name;
        this.item_id = item_id;
        this.in_out = in_out;
        this.client_name= client_name;
        this.quantity= quantity;
        this.tot_amt= tot_amt;
    }
    public String getorder_no(){
        return order_no;
    }
    public String getorder_date(){
        return order_date;
    }
    public String getitem_name(){
        return item_name;
    }
    public String getitem_id(){
        return item_id;
    } 
    public String getin_out(){
        return in_out;
    }
    public String getclient_name(){
        return client_name;
    }
    public Integer getquantity(){
        return quantity;
    }
    public Double gettot_amt(){
        return tot_amt;
    }
}
