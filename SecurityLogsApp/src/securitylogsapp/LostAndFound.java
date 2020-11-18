/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitylogsapp;

/**
 *
 * @author HNMP
 */
public class LostAndFound {
    
    int uniID;
    int itemID;
    String itemDsc;
    String place;
    String date;
    String time;
    String status;
    
    public LostAndFound(int uniID, int itemID, String itemDsc, String place, String date, String time, String status){
        
        this.uniID = uniID;
        this.itemID = itemID;
        this.itemDsc = itemDsc;
        this.place = place;
        this.date = date;
        this.time = time;
        this.status = status;
        
    }
        
}
