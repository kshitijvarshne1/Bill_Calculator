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
            sc.nextLine();
            System.out.println("Enter the type of item (Raw, Manufactured and Imported )");
            String type = sc.nextLine();
            itemDetails.add(new ItemDetail(name,price,quantity,type));
            System.out.println("Do you want to enter details of any other item (y/n):");
            check = sc.nextLine();
        }
    }
}

