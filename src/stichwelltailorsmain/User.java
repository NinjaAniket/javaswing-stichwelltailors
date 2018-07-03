/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stichwelltailorsmain;

/**
 *
 * @author anike
 */
public class User {
    private int id;
    private String date;
    private int bill_no;
    private String party_name;
    private int amount;
    private String paid_date;
    private int amount_remain;

    public User(int id, String date, int bill_no, String party_name, int amount, String paid_date, int amount_remain) {
        this.id = id;
        this.date = date;
        this.bill_no = bill_no;
        this.party_name = party_name;
        this.amount = amount;
        this.paid_date = paid_date;
        this.amount_remain = amount_remain;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBill_no() {
        return bill_no;
    }

    public void setBill_no(int bill_no) {
        this.bill_no = bill_no;
    }

    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaid_date() {
        return paid_date;
    }

    public void setPaid_date(String paid_date) {
        this.paid_date = paid_date;
    }

    public int getAmount_remain() {
        return amount_remain;
    }

    public void setAmount_remain(int amount_remain) {
        this.amount_remain = amount_remain;
    }
    
    

 
}
