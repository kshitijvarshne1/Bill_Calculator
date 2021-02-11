/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Feb-21
 *   Time: 9:04 PM
 *   File: Main.java
 */

package Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ItemDetail> itemDetails = new ArrayList<>();
        String check = "y";
        while (check.equals("y")) {
            System.out.println("Enter the item name");
            String name = sc.nextLine();
            System.out.println("Enter the price");
            int price = 0;
            boolean pCheck = true;
            while (pCheck) {
                try {
                    price = sc.nextInt();
                    pCheck = false;
                } catch (InputMismatchException e) {
                    System.out.println("Entered price is wrong please again input the price");
                    sc.next();
                }
            }
            System.out.println("Enter the quantity");
            int quantity = 0;
            boolean qCheck = true;
            while (qCheck) {
                try {
                    quantity = sc.nextInt();
                    qCheck = false;
                } catch (InputMismatchException e) {
                    System.out.println("Entered quantity is wrong please again input the quantity");
                    sc.next();
                }
            }
            System.out.println("Enter the type of item (1 for Raw,2 for Manufactured and 3 for Imported )");
            int typeNo = 0;
            boolean tCheck = true;
            while (tCheck) {
                try {
                    typeNo = sc.nextInt();
                    tCheck = checkNo(typeNo);
                } catch (InputMismatchException e) {
                    System.out.println("Entered type is not available again input enter the type of item (1 for Raw,2 for Manufactured and 3 for Imported ) ");
                    sc.next();
                }
            }
            String type = checkType(typeNo);
            sc.nextLine();
            itemDetails.add(new ItemDetail(name,price,quantity,type));
            System.out.println("Do you want to enter details of any other item (y/n):");
            boolean aCheck = true;
            while (aCheck) {
                try {
                    check=sc.nextLine();
                    aCheck = checkNo(check);
                } catch (InputMismatchException e) {
                    System.out.println("Entered type is not available again input enter for Do you want to enter details of any other item (y/n): ");
                    sc.next();
                }
            }
        }
        for (ItemDetail i: itemDetails ){
            System.out.println(i);
        }
    }
    public static boolean checkNo(String check){
        if(check.equals("y") || check.equals("n")){
            return false;
        }
        System.out.println("Entered type is not available again input for Do you want to enter details of any other item (y/n):  ");
        return true;
    }
    public static boolean checkNo(int typeNo){
        if(typeNo>=1 && typeNo<=3){
            return false;
        }
        System.out.println("Entered type is not available again input enter the type of item (1 for Raw,2 for Manufactured and 3 for Imported ) ");
        return true;
    }
    public static String checkType(int typeNo){
        if(typeNo==1){
            return "Raw";
        }
        else if(typeNo==2){
            return "Manufactured";
        }
        else{
            return "Imported";
        }
    }
}
