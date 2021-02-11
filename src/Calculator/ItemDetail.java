/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Feb-21
 *   Time: 9:04 PM
 *   File: ItemDetail.java
 */

package Calculator;

public class ItemDetail {
    private String itemName;
    private float itemPrice;
    private int itemQuantity;
    private String itemType;

    public ItemDetail() {
        this.itemName = null;
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemType = null;
    }

    public ItemDetail(String itemName, int itemPrice, int itemQuantity, String itemType) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public float calulateTax(){
        float rawTax= (float) ((this.itemPrice*12.5)+this.itemPrice);
        float manufactureTax = rawTax+2*(this.itemPrice+rawTax);
        if(this.itemType=="Raw"){
            return rawTax*this.itemQuantity;
        }
        else if(this.itemType=="Manufacture"){
            return manufactureTax*this.itemQuantity;
        }
        else{
            float tax1=10*this.itemPrice+manufactureTax;
            if(tax1<=100){
                return (tax1+5)*this.itemQuantity;
            }
            else if(tax1<=200){
                return (tax1+10)*this.itemQuantity;
            }
            else{
                return (tax1+(5*tax1))*this.itemQuantity;
            }
        }
    }


}

