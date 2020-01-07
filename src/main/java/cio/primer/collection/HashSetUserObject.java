package cio.primer.collection;


/**
 * Write a description of class HashSetUserObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class HashSetUserObject
{
    public static void main(String a[]){ 
        HashSet<Price> lhs = new HashSet<Price>(); 
        lhs.add(new Price("Banana", 20)); 
        lhs.add(new Price("Apple", 40)); 
        lhs.add(new Price("Apple", 40));
        lhs.add(new Price("Orange", 30)); 
        for(Price pr:lhs){ 
            System.out.println(pr); 
        } 
        Price key = new Price("Banana", 20); 
        System.out.println("Does set contains key? "+lhs.contains(key)); 
    } 
}
class Price{
     
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }
}
