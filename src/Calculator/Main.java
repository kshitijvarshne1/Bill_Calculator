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
        Scanner sc= new Scanner(System.in);
        ArrayList<ItemDetail> itemDetails= new ArrayList<>();
        String check="y";
        while(check.equals("y")){
            System.out.println("Enter the item name");
            String name= sc.nextLine();
            System.out.println("Enter the price");
            int price=0;
            boolean pCheck=true;
            while(pCheck){
                try{
                    price=sc.nextInt();
                    pCheck=false;
                }
                catch (InputMismatchException e){
                    System.out.println("Entered price is wrong please again input the price");
                    sc.next();
                }
            }

        }
        for(ItemDetail i:itemDetails){
            System.out.println(i);
        }
    }
}

